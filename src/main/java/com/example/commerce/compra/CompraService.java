package com.example.commerce.compra;

import java.util.List;

public interface CompraService {

    Compra findOne(Long id);

    List<Compra> findAll();

    Compra save (Compra compra);

    void delete (Compra compra);
}
