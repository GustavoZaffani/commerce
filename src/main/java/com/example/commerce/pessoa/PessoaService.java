package com.example.commerce.pessoa;

import java.util.List;

public interface PessoaService {

    Pessoa findOne(Long id);

    List<Pessoa> findAll();

    Pessoa save (Pessoa pessoa);

    void delete (Pessoa pessoa);
}
