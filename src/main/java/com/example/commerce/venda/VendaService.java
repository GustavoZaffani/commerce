package com.example.commerce.venda;

import java.util.List;

public interface VendaService {

    Venda findOne (Long id);

    List<Venda> findAll();

    Venda save (Venda venda);

    void delete (Long id);

}
