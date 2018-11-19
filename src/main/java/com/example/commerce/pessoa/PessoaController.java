package com.example.commerce.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/{id}")
    public Pessoa findOne(@PathVariable("id") Integer id){
        return pessoaService.findOne(id);
    }

    @GetMapping
    public List<Pessoa> findAll(){
        return pessoaService.findAll();
    }

    @PostMapping
    public Pessoa save(@RequestBody Pessoa pessoa){
        return pessoaService.save(pessoa);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        pessoaService.delete(id);
    }

    @GetMapping("/complete")
    public List<Pessoa> complete(@RequestParam("query") String query,
                                 @RequestParam("categoria") String categoria){
        return pessoaService.complete(query, categoria);
    }
}
