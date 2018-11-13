package com.example.commerce.compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping("/{id}")
    public Compra findOne(@PathVariable("id") Long id){
        return compraService.findOne(id);
    }
    @GetMapping
    public List<Compra> findAll(){
        return compraService.findAll();
    }
    @PostMapping
    public Compra save(@RequestBody Compra compra){
        return compraService.save(compra);
    }
    @DeleteMapping
    public void delete(@RequestBody Compra compra){
        compraService.delete(compra);
    }
}
