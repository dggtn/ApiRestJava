package med.voll.api.paciente;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.direccion.Direccion;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Paciente")
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String documentoIdentidad;
    private String telefono;

    @Embedded
    private Direccion direccion;
    private Boolean activo;

    public Paciente(DatosRegistroPaciente datos) {
        this.activo = true;
        this.nombre = datos.nombre();
        this.email = datos.email();
        this.telefono = datos.telefono();
        this.documentoIdentidad = datos.documentoIdentidad();
        this.direccion = new Direccion(datos.direccion());
    }

    public void atualizarInformacion(DatosActualizacionPaciente datos) {
        if (datos.nombre() != null)
            this.nombre = datos.nombre();

        if (datos.telefono() != null)
            this.telefono = datos.telefono();

        if (datos.direccion() != null)
            direccion.atualizarInformacion(datos.direccion());
    }

    public void inactivar() {
        this.activo = false;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void actualizarInformacion(@Valid DatosActualizacionPaciente datos) {
    }

    public void eliminar() {
    }
}