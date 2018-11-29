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

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        compraService.delete(id);
    }

    @GetMapping("/complete")
    public List <Compra> complete(@RequestParam("query") String query) {
        return compraService.complete(query);
    }

    @GetMapping("/disponivel")
    public List<Compra> findAllDisponiveis(){
        return compraService.findAllDisponiveis();
    }
}
