package med.voll.api.paciente;

import med.voll.api.controller.Valid;
import med.voll.api.direccion.DatosDireccion;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

public record DatosRegistroPaciente(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefono,
        @NotBlank
        String documentoIdentidad,
        @NotNull @Valid
        DatosDireccion direccion
){

}
