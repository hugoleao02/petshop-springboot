package br.com.petshop.br.com.petshop.controllers;

import br.com.petshop.br.com.petshop.model.entities.Fornecedor;
import br.com.petshop.br.com.petshop.model.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @PostMapping
    public Fornecedor novoFornecedor(Fornecedor fornecedor){
        fornecedorRepository.save(fornecedor);
        return fornecedor;
    }

    @PutMapping
    public Fornecedor alterarFornecedor(Fornecedor fornecedor){
        fornecedorRepository.save(fornecedor);
        return fornecedor;
    }

    @GetMapping("/{id}")
    public Optional<Fornecedor> obterFornecedor(@PathVariable int id){
        return  fornecedorRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletarFornecedor(@PathVariable int id){ fornecedorRepository.findById(id);
    }

}
