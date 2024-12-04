package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.controller.Valid;
import med.voll.api.direccion.DatosDireccion;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String documento, String telefono, @Valid DatosDireccion direccion) {
}
