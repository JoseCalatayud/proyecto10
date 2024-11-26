package es.santander.ascender.proyecto10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/solicitud")
public class SolicitudController {

    @GetMapping
    public String get(){

        //aqui iria la logica

        return "pagina1";
    }
}
