package com.example.commerce.compra;

import java.util.List;

public interface CompraService {

    Compra findOne(Integer id);

    List<Compra> findAll();

    Compra save (Compra compra);

    void delete (Long id);

    List<Compra> complete (String query);
}
