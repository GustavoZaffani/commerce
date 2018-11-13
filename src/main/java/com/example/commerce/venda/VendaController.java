package com.example.commerce.venda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping("/{id}")
    public Venda findOne(@PathVariable("id") Long id){
        return vendaService.findOne(id);
    }
    @GetMapping
    public List<Venda> findAll(){
        return vendaService.findAll();
    }
    @PostMapping
    public Venda save (@RequestBody Venda venda){
        return vendaService.save(venda);
    }
    @DeleteMapping
    public void delete(@RequestBody Venda venda){
        vendaService.delete(venda);
    }

}
