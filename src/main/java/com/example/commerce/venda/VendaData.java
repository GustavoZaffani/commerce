package com.example.commerce.venda;

import com.example.commerce.itemVenda.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VendaData extends JpaRepository<Venda, Long> {


}
