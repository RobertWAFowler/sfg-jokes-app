package com.zenhog.sfgjokesapp.controller;

import com.zenhog.sfgjokesapp.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {

        this.jokesService = jokesService;
    }

    @RequestMapping({"/jokes","/",""})
    public String getJokes(Model model) {

        model.addAttribute("joke", jokesService.getJoke());

        return "chucknorris";
    }
}
