package com.example.commerce.venda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaServiceImpl implements VendaService{

    @Autowired VendaData vendaData;

    @Override
    public Venda findOne(Long id) {
        return vendaData.findById(id).orElse(null);
    }

    @Override
    public List<Venda> findAll() {
        return vendaData.findAll();
    }

    @Override
    public Venda save(Venda venda) {
        return vendaData.save(venda);
    }

    @Override
    public void delete(Venda venda) {
        vendaData.delete(venda);
    }
}
