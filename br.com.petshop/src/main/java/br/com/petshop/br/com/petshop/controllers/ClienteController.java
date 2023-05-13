package br.com.petshop.br.com.petshop.controllers;

import br.com.petshop.br.com.petshop.model.entities.Cliente;
import br.com.petshop.br.com.petshop.model.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping
    public Cliente novoCliente(Cliente cliente){
        clienteRepository.save(cliente);
        return cliente;
    }

    @PutMapping
    public Cliente alteraCliente(Cliente cliente){
        clienteRepository.save(cliente);
        return cliente;
    }

    @GetMapping(path = "/{id}")
    public Optional<Cliente> obterCliente(@PathVariable int id){
        return clienteRepository.findById(id);
    }

    @DeleteMapping( "/{id}")
    public void deletarCliente(@PathVariable int id){
        clienteRepository.deleteById(id);
    }
}
