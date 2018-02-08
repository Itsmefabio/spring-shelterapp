package com.dmigus.shelterapp;

import com.dmigus.shelterapp.api.ZwierzeRepository;
import com.dmigus.shelterapp.beans.Zwierze;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String dodaj() {

        return "dodaj";
    }
//    @RequestMapping("/usun")
//    public String usun(Model model) {
//        Zwierze zwierze = new Zwierze();
//        Zwierze.setId("id");
//
//        model.addAttribute("zwierze", zwierze);
//        return "usun";}
//
//        @RequestMapping("/usunprocess")
//        public String usunprocess(@ModelAttribute(value="zwierze"),Zwierze zwierze) {
//
//        return "usun";
//    }
    @RequestMapping("/edycja")
    public String edit() {

        return "edit";
    }
}
