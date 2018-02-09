package com.dmigus.shelterapp;

import com.dmigus.shelterapp.api.ZwierzeRepository;
import com.dmigus.shelterapp.beans.Zwierze;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.util.List;


@Controller

public class MainController {
private final ZwierzeRepository zwierzeRepository;

    public MainController(ZwierzeRepository zwierzeRepository) {
        this.zwierzeRepository = zwierzeRepository;
    }




    @RequestMapping("/login")
    public String login() {

       return "login";}

       @RequestMapping("/index")
        public String index(Model model) {

List<Zwierze> listaZ= zwierzeRepository.findAll();
model.addAttribute("listaZ", listaZ);
            return "index";
}
    @RequestMapping("/dodaj")
    public String dodaj(Model model) {
        model.addAttribute("zwierze",  new Zwierze());
        return "dodaj";
    }
    @PostMapping("/dodaj")
    public String dodajSubmit(@ModelAttribute Zwierze zwierze) {
        zwierzeRepository.save(zwierze);
        return "dodaj";
    }

   @GetMapping ("/usun")
     public String usun(Model model) {


        model.addAttribute("zwierze",  new Zwierze());
        return "usun";}



    @PostMapping("/usun")
    public String usunSubmit(@ModelAttribute Zwierze zwierze) {
zwierzeRepository.delete(zwierze);


        return "usun";
    }

    @RequestMapping("/edycja")
    public String edycja(Model model) {


        model.addAttribute("zwierze",  new Zwierze());
        return "edycja";}

    @PostMapping("/edycja")
    public String edycjaSubmit(@ModelAttribute Zwierze zwierze) {
       return "index";
    }}
