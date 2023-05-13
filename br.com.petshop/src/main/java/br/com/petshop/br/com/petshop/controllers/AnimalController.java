package br.com.petshop.br.com.petshop.controllers;

import br.com.petshop.br.com.petshop.model.entities.Animal;
import br.com.petshop.br.com.petshop.model.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;

    @RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
    public Animal novoAnimal(Animal animal){
        animalRepository.save(animal);
        return animal;
    }
}
