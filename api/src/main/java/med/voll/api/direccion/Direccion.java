package med.voll.api.direccion;


import jakarta.persistence.Embeddable;

@Embeddable
public class Direccion {
    String calle;
    String distrito;
    String ciudad;
    String numero;
    String complemento;

}
