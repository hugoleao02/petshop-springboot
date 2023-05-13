package br.com.petshop.br.com.petshop.model.repositories;

import br.com.petshop.br.com.petshop.model.entities.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteRepository extends PagingAndSortingRepository<Cliente,Integer> {
}
