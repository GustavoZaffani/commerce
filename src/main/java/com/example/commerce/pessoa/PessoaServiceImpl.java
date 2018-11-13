package com.example.commerce.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired PessoaData pessoaData;

    @Override
    public Pessoa findOne(Long id) {
        return pessoaData.findById(id).orElse(null);
    }

    @Override
    public List<Pessoa> findAll() {
        return pessoaData.findAll();
    }

    @Override
    public Pessoa save(Pessoa pessoa) {
        return pessoaData.save(pessoa);
    }

    @Override
    public void delete(Pessoa pessoa) {
        pessoaData.delete(pessoa);
    }
}
