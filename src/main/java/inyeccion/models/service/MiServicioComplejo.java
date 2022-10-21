package inyeccion.models.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.persistence.PreUpdate;


@Component("miServicioComplejo")
@Primary
public class MiServicioComplejo implements IService {

    @Override
    public String operacion() {
        return "Ejecutando algún servicio complejo...";
    }

    /*
    @Autowired
    public String operacion() {
        return "Ejecutando algún proceso importante simple...";
    }*/
}


