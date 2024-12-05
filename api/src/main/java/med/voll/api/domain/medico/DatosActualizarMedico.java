package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.controller.Valid;
import med.voll.api.domain.direccion.DatosDireccion;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, String telefono, @Valid DatosDireccion direccion) {
}
