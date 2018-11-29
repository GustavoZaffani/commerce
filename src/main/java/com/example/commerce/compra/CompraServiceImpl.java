package com.example.commerce.compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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
    public void delete(Long id) {
        compraData.deleteById(id);
    }

    @Override
    public List<Compra> complete(String query) {
        if("".equalsIgnoreCase(query)){
            return compraData.findAllByVendidoIsFalse();
        } else {
            return compraData.findByModeloLikeAndVendidoIsFalse("%" + query + "%");
        }
    }

    @Override
    public List<Compra> findAllDisponiveis() {
        return compraData.findAllByVendidoIsFalse();
    }
}
