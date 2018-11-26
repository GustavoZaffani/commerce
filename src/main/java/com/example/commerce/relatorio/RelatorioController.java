package com.example.commerce.relatorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioService relatorioService;

    @GetMapping("/{id}")
    public Relatorio findOne(@PathVariable("id") Integer id) {
        return relatorioService.findOne(id);
    }

    @GetMapping
    public List<Relatorio> findAll(){
        return relatorioService.findAll();
    }
}
