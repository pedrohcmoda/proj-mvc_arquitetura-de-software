package com.proj.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proj.mvc.models.dto.LandingPageDTO;

@Controller
@RequestMapping(value = "/")
public class LandingPageController {
    
    @GetMapping()
    public String landingPage(Model model) {
        model.addAttribute("modelo", new LandingPageDTO("Ambiente Configurado", null));
        return "index";
    }

    @GetMapping("/multiplicar")
    public String multiplicar(@RequestParam int numero1, @RequestParam int numero2, Model model) {
        double resultado = numero1 * numero2;
        LandingPageDTO landingPageModel = new LandingPageDTO();
        landingPageModel.setMensagemPadrao("Ambiente Configurado");
        landingPageModel.setResultado(resultado);
        model.addAttribute("modelo", landingPageModel);
        return "index";
    }
}
