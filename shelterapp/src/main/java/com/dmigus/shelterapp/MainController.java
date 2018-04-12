package com.dmigus.shelterapp;


import com.dmigus.shelterapp.api.DogRepository;
import com.dmigus.shelterapp.api.EmailSender;
import com.dmigus.shelterapp.api.ImageRepository;
import com.dmigus.shelterapp.beans.Dog;
import com.dmigus.shelterapp.beans.Image;
import com.dmigus.shelterapp.beans.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


@Controller

public class MainController {
    private static String UPLOAD_FOLDER = "C://Users//Fabio//Downloads//spring-shelterapp-master//shelterapp//src//main//resources//images//";
    private final DogRepository dogRepository;
    private final ImageRepository imageRepository;
    private final EmailSender emailSender;
    public MainController(DogRepository dogRepository, ImageRepository imageRepository, EmailSender emailSender) {
        this.dogRepository = dogRepository;
        this.imageRepository = imageRepository;
        this.emailSender = emailSender;
    }

    @RequestMapping("/login")
    public String login() {

        return "login";
    }


    @RequestMapping({"/index", "/"})
    public String index(Model model) {

        List<Dog> animalList = dogRepository.findAll();
        List<Image> imageList = imageRepository.findAll();
        model.addAttribute("animalList", animalList);
        model.addAttribute("imageList", imageList);
        return "index";
    }

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

    @RequestMapping("/upload")
    public ModelAndView showUpload() {
        return new ModelAndView("upload");
    }

    @PostMapping("/upload")
    public ModelAndView fileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
        Image image = new Image();
        if (file.isEmpty()) {
            return new ModelAndView("status", "message", "Please select a file and try again");
        }

        try {

            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            image.setPath(path.toString());
            imageRepository.save(image);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ModelAndView("status", "message", "File Uploaded sucessfully");
    }


    @RequestMapping("/contact")
    public String Email(Model model) {
        model.addAttribute("mail", new Mail());
        return "contact";
    }

    @PostMapping("/contact")
    public String SendEmail(@ModelAttribute Mail mail) {
        String subject = mail.getSubject();
        String sender = mail.getSender();
        String content = mail.getMessage();
        emailSender.sendEmail("schroniskoswietyspokoj@gmail.com", subject, content, sender);

        return "index";

    }
}

