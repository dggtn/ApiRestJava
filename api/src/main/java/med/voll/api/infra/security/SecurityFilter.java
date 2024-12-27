package med.voll.api.infra.security;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import med.voll.api.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.xml.crypto.dsig.spec.XPathType;
import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UsuarioRepository usuarioRepository;


    //metodo para autenticar y verificar que usuario existe
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        var authHeader = request.getHeader("Authorization");
        System.out.println(authHeader);

        if (authHeader != null) {
            System.out.println("Validamos que el authHeader no es null");
            var token = authHeader.replace(("Bearer"),"");
            var nombreDeUsuario = tokenService.getSubject(token); //extract userName
            if(nombreDeUsuario !=null){
                //token valido
                var usuario = usuarioRepository.findByLogin(nombreDeUsuario);
                var authentication = new UsernamePasswordAuthenticationToken(usuario,null,
                        usuario.getAuthorities()); //forzamos inicio de sesion
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }

        filterChain.doFilter(request, response);
    }

    private String recuperarToken(HttpServletRequest request) {
        var authorizationHeader = request.getHeader("Authorization");
        if (authorizationHeader != null) {
            return authorizationHeader.replace("Bearer ", "");
        }

        return null;
    }

}