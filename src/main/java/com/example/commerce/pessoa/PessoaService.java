package com.example.commerce.pessoa;

import java.util.List;

public interface PessoaService {

    Pessoa findOne(Integer id);

    List<Pessoa> findAll();

    Pessoa save (Pessoa pessoa);

    void delete(Integer id);

    List<Pessoa> complete(String query, String categoria);
}
