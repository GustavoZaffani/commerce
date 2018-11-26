package com.example.commerce.relatorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatorioServiceImpl implements RelatorioService{

    @Autowired
    private RelatorioData relatorioData;

    @Override
    public Relatorio findOne(Integer id) {
        return relatorioData.findById(id).orElse(null);
    }

    @Override
    public List<Relatorio> findAll() {
        return relatorioData.findAll();
    }
}
