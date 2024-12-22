package med.voll.api.domain.usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {

   static UserDetails findByUsername(String username);
}
