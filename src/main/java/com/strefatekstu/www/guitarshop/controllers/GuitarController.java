package com.strefatekstu.www.guitarshop.controllers;

import com.strefatekstu.www.guitarshop.models.Guitar;
import com.strefatekstu.www.guitarshop.repositories.GuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class GuitarController {
    @Autowired
    GuitarRepository guitarRepository;

    @ResponseBody
    @GetMapping("/guitars")
    public List<Guitar> guitarList(){
        return guitarRepository.findAll();
    }
}
