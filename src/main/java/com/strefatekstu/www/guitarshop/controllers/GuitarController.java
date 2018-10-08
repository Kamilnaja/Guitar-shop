package com.strefatekstu.www.guitarshop.controllers;

import com.strefatekstu.www.guitarshop.models.Guitar;
import com.strefatekstu.www.guitarshop.repositories.GuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@Controller
public class GuitarController {

    @Autowired
    GuitarRepository guitarRepository;

    @ResponseBody
    @RequestMapping(value = "/guitars", method = RequestMethod.GET)
    public List<Guitar> guitarList() {
        return guitarRepository.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/guitars/{id}", method = RequestMethod.GET)
    public Optional<Guitar> getGuitar(@PathVariable("id") Integer id) {
        return guitarRepository.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/guitars", method = RequestMethod.POST)
    public List<Guitar> addGuitar(@RequestBody Guitar guitar) {
        guitarRepository.save(guitar);
        return guitarRepository.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/guitars/{id}", method = RequestMethod.DELETE)
    public List<Guitar> removeGuitar(@PathVariable("id") Integer id) {
        guitarRepository.deleteById(id);
        return guitarRepository.findAll();
    }

    @RequestMapping(value = "/guitars/{id}", method = RequestMethod.PUT)
    public Guitar changeGuitarData(@PathVariable("id") Integer id, @RequestBody Guitar guitar) {
        guitarRepository.findById(id);
        return guitarRepository.save(guitar);
    }
}
