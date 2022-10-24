package inyeccion.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class ItemFactura {

    private Producto producto;
    private Integer cantidad;

    public ItemFactura() {
    }

}
