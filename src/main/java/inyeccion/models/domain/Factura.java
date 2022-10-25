package inyeccion.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@Component
@SessionScope
//@RequestScope
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;


    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;

    @Autowired
    private List<ItemFactura> items;

    @PostConstruct
    public void inicializar() {
        System.out.println(cliente.getNombre());
        cliente.setNombre(cliente.getNombre().concat(" ").concat("Xavier "));
        descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre().concat(" ").concat(cliente.getApellido()).concat("Romero"));
    }

    @PreDestroy
    public void destruir() {
        System.out.println("Factura destruida.");
    }

    public Factura() {
    }

}
