package inyeccion.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Cliente {

    @Value("{cliente.nombre}")
    private String nombre;

    @Value("{cliente.apellido}")
    private String apellido;

    public Cliente() {
    }
}
