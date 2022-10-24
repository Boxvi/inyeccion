package inyeccion.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class MiServicio implements IService {

    @Override
    public String operacion() {
        return "Ejecutando algún proceso importante simple..., Mi servicio Simple";
    }

}

/*
@Component
public class MiServicio implements IService {
    @Override
    public String operacion() {
        return "Ejecutando algún proceso importante simple..., desde una interface";
    }

    /*
    @Autowired
    public String operacion() {
        return "Ejecutando algún proceso importante simple...";
    }
}

*/