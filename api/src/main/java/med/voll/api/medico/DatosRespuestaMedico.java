package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String telefono, String documento, String email,
                                   DatosDireccion direccion) {
}
