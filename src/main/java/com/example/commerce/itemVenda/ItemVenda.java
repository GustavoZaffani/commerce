package com.example.commerce.itemVenda;

import com.example.commerce.compra.Compra;
import com.example.commerce.venda.Venda;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM_VENDA")
@Data
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "ID_VENDA")
    private Venda venda;

    @ManyToOne
    @JoinColumn(name = "ID_CARRO")
    private Compra veiculo;

    @Column(name = "VLR_UNITARIO")
    private BigDecimal valorUnitario;

    @Column(name = "DESCONTO")
    private BigDecimal desconto;

    @Column(name = "VLR_TOTAL")
    private BigDecimal valorTotal;
}
