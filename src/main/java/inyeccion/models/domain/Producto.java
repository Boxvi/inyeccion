package inyeccion.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Producto {

    private String nombre;
    private Integer precio;

    public Producto() {
    }
}
