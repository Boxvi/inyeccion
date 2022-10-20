package inyeccion.controllers;

import inyeccion.models.service.IService;
import inyeccion.models.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private IService iService;

    /*
    @Autowired
    private MiServicio miServicio;*/

    @GetMapping({"/", "/index",""})
    public String index(Model model){

        model.addAttribute("objeto", iService.operacion());

        return "index";
    }
}
