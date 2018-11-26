package com.example.commerce.relatorio;

import java.util.List;

public interface RelatorioService {

    Relatorio findOne (Integer id);

    List<Relatorio> findAll();


}
