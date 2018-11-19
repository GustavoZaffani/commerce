package com.example.commerce.pessoa;

import jdk.jfr.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PessoaData extends JpaRepository<Pessoa, Long> {

    List<Pessoa> findByNomeLikeAndCategoriaEquals(String nome, String categoria, Pageable page);

    List<Pessoa> findByCategoria(String categoria);
}
