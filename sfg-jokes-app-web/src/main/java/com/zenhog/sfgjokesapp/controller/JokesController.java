package com.zenhog.sfgjokesapp.controller;

import com.zenhog.sfgjokesapp.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JokesController {

    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {

        this.jokesService = jokesService;
    }
}
