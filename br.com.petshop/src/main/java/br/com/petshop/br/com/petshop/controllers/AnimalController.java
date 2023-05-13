package br.com.petshop.br.com.petshop.controllers;

import br.com.petshop.br.com.petshop.model.entities.Animal;
import br.com.petshop.br.com.petshop.model.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;

    @PostMapping
    public Animal novoAnimal(Animal animal){
        animalRepository.save(animal);
        return animal;
    }

    @PutMapping
    public Animal alteraAnimal(Animal animal){
        animalRepository.save(animal);
        return animal;
    }

    @GetMapping("/{id}")
    public Optional<Animal> obterAnimal(@PathVariable int id){
        return animalRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAnimal(@PathVariable int id){
        animalRepository.deleteById(id);
    }
}
