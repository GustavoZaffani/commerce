package com.example.commerce.compra;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface CompraData extends JpaRepository<Compra, Long> {

    List<Compra> findByModeloLike(String modelo);

}
