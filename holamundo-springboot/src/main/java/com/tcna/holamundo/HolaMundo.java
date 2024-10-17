package com.tcna.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class HolaMundo {

    @GetMapping("/holamundo")
    @ResponseBody
    public String mostrarMensaje() {
        return "Hola mundo, soy Diego desde Spring Boot";
    }

}
