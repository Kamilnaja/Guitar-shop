package com.strefatekstu.www.guitarshop.controllers;

import com.strefatekstu.www.guitarshop.models.Guitar;
import com.strefatekstu.www.guitarshop.repositories.GuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class GuitarController {

    private final
    GuitarRepository guitarRepository;

    @Autowired
    public GuitarController(GuitarRepository guitarRepository) {
        this.guitarRepository = guitarRepository;
    }

    @GetMapping("guitars")
    public List<Guitar> guitarList() {
        return guitarRepository.findAll();
    }

    @GetMapping("/guitars/{id}")
    public Optional<Guitar> getGuitar(@PathVariable("id") Integer id) {
        return guitarRepository.findById(id);
    }

    @PostMapping("/guitars")
    public List<Guitar> addGuitar(@RequestBody Guitar guitar) {
        guitarRepository.save(guitar);
        return guitarRepository.findAll();
    }

    @DeleteMapping("/guitars/{id}")
    public List<Guitar> removeGuitar(@PathVariable("id") Integer id) {
        guitarRepository.deleteById(id);
        return guitarRepository.findAll();
    }

    @PutMapping(value = "/guitars/{id}")
    public Guitar changeGuitarData(@PathVariable("id") Integer id, @RequestBody Guitar guitar) {
        guitarRepository.findById(id);
        return guitarRepository.save(guitar);
    }
}
