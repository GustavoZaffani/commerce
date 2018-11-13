package com.example.commerce.compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {

    @Autowired CompraData compraData;

    @Override
    public Compra findOne(Long id) {
        return compraData.findById(id).orElse(null);
    }

    @Override
    public List<Compra> findAll() {
        return compraData.findAll();
    }

    @Override
    public Compra save(Compra compra) {
        return compraData.save(compra);
    }

    @Override
    public void delete(Compra compra) {
        compraData.delete(compra);
    }
}
