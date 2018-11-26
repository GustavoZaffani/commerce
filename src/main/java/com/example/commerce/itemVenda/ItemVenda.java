/*
package com.example.commerce.itemVenda;

import com.example.commerce.compra.Compra;
import com.example.commerce.venda.Venda;
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

    @ManyToOne
    @Column(name = "ID_VENDA")
    private Venda venda;

    @ManyToOne
    @Column(name = "ID_CARRO")
    private Compra carro;

    @Column(name = "QTDE")
    private Integer qtde;

    @Column(name = "VLR_UNITARIO")
    private BigDecimal vlrUnitario;

    @Column(name = "DESCONTO")
    private BigDecimal desconto;

    @Column(name = "VLR_TOTAL")
    private BigDecimal vlrTotal;
}
*/
