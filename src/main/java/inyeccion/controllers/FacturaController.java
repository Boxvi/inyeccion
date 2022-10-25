package inyeccion.controllers;

import inyeccion.models.domain.Cliente;
import inyeccion.models.domain.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.ClientEndpointConfig;

@Controller
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    private Factura factura;

    @GetMapping("/ver")
    public String ver(Model model) {
        model.addAttribute("titulo", "Ejemplo de factura con inyección de dependencias");
        model.addAttribute("factura", factura);
        return "factura/ver";
    }
}
/*

    @Autowired
    @Qualifier("miServicioSimple")
    private IService iService;

    @GetMapping({"/", "/index", ""})
    public String index(Model model) {
        model.addAttribute("objeto", iService.operacion());
        return "index";
    }
 */