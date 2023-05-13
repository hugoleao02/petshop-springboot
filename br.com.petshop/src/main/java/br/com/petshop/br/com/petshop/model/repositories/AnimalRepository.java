package br.com.petshop.br.com.petshop.model.repositories;

import br.com.petshop.br.com.petshop.model.entities.Animal;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AnimalRepository extends PagingAndSortingRepository<Animal,Integer> {
}
