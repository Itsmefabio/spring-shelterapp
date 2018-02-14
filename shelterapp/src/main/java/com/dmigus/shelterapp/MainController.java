package com.dmigus.shelterapp;

import com.dmigus.shelterapp.api.DogRepository;
import com.dmigus.shelterapp.beans.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller

public class MainController {
    private final DogRepository dogRepository;

    public MainController(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }


    @RequestMapping("/login")
    public String login() {

        return "login";
    }


    @RequestMapping({"/index", "/"})
    public String index(Model model) {

        List<Dog> listd = dogRepository.findAll();
        model.addAttribute("listd", listd);
       return "index";}

    @RequestMapping("/add")
    public String add(Model model) {
        model.addAttribute("dog", new Dog());
        return "add";
    }

    @PostMapping("/add")
    public String addSubmit(@ModelAttribute Dog dog) {


        dogRepository.save(dog);
        return "redirect:index";
    }

    @GetMapping("/remove")
    public String remove(Model model) {


        model.addAttribute("dog", new Dog());
        return "remove";
    }


    @PostMapping("/remove")
    public String removeSubmit(@ModelAttribute Dog dog) {
        dogRepository.delete(dog);


        return "redirect:index";
    }

    @RequestMapping("/edit")
    public String edit(Model model) {


        model.addAttribute("dog", new Dog());
        return "edit";
    }

    @PostMapping("/edit")
    public String editSubmit(@ModelAttribute Dog dog) {
        dogRepository.save(dog);


        return "redirect:index";
    }
}
