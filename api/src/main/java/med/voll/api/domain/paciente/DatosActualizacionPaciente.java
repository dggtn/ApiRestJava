package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.controller.Valid;
import med.voll.api.domain.direccion.DatosDireccion;

public record DatosActualizacionPaciente(@NotNull Long id, String nombre, String documento, String telefono, @Valid DatosDireccion direccion){
}
