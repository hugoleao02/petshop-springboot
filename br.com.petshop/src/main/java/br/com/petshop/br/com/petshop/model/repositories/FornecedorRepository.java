package br.com.petshop.br.com.petshop.model.repositories;

import br.com.petshop.br.com.petshop.model.entities.Fornecedor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FornecedorRepository extends PagingAndSortingRepository<Fornecedor,Integer> {
}
