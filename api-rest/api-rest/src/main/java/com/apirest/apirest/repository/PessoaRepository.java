package com.apirest.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apirest.apirest.entities.Pessoa;
import org.springframework.stereotype.Repository;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
