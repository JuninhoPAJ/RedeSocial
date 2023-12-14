package com.web.redesocial.RedeSocial.controller;

import com.web.redesocial.RedeSocial.model.SocialUser;

import com.web.redesocial.RedeSocial.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RedeSocialController {
    private UserRepository userRepository;


    public RedeSocialController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/cadastrar")
    public String listarUsers(Model model){
        model.addAttribute("user", new SocialUser());
        model.addAttribute("users", userRepository.findAll());
        return "cadastrar";
    }

    @PostMapping("/cadastrar")
    public String newUser(@ModelAttribute SocialUser socialUser, Model model){
       userRepository.save(socialUser);
       return "login";
    }

    @GetMapping("/login")
    public String usersLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String logar(){
        return "logar";
    }

    @GetMapping("/logar")
    public String contaLogada(){
        return "logar";
    }

    @PostMapping("/logar")
    public String novaPostagem(){
    return "logar";
    }
/*
    @GetMapping("/novapostagem")
    public String newpost(){
        return "novapostagem";
    }*/

    @PostMapping("/novapostagem")
    public String nova(){
        return "novapostagem";
    }




}
