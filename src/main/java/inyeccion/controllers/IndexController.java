package inyeccion.controllers;

import inyeccion.models.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {

    @Autowired
    @Qualifier("miServicioSimple")
    private IService iService;

    /*
    @Autowired
    private MiServicio miServicio;*/

    @GetMapping({"/", "/index", ""})
    public String index(Model model) {
        model.addAttribute("objeto", iService.operacion());
        return "index";
    }

    /*
    @Autowired
    public void setiService(IService iService) {
        this.iService = iService;
    }

    @Autowired
    public IndexController(IService iService) {
        this.iService = iService;
    }*/
}
