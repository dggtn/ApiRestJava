package med.voll.api.domain.medico;

import med.voll.api.domain.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String telefono, String documento, String email,
                                   DatosDireccion direccion) {
}
