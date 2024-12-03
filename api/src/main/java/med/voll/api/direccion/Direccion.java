package med.voll.api.direccion;


import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Direccion {
    String calle;
    String distrito;
    String ciudad;
    String numero;
    String complemento;


    public Direccion(String calle, String distrito, String ciudad, String numero, String complemento) {
        this.calle = calle;
        this.distrito = distrito;
        this.ciudad = ciudad;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Direccion() {
    }

    public Direccion(DatosDireccion direccion) {
        this.calle=direccion.calle();
        this.distrito = direccion.distrito();
        this.ciudad = direccion.ciudad();
        this.numero = direccion.numero();
        this.complemento = direccion.complemento();

    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
