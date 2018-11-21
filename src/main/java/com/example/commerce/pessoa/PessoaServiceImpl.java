package com.example.commerce.pessoa;

import antlr.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired PessoaData pessoaData;

    @Override
    public Pessoa findOne(Integer id) {
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
    public void delete(Integer id) {
        pessoaData.deleteById(id);
    }

    @Override
    public List<Pessoa> complete(String query, String categoria) {
        if ("".equalsIgnoreCase(query)){
            return pessoaData.findByCategoria(categoria);
        }else{
            return pessoaData.findByNomeLikeAndCategoriaEquals("%" + query + "%", categoria,
                    PageRequest.of(0 , 20));
        }
    }


}
