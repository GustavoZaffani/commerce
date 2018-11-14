package com.example.commerce.compra;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "COMPRAS")
@Data
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotNull
    @Column(name = "MARCA")
    private String marca;

    @NotNull
    @Column(name = "MODELO")
    private String modelo;

    @Column(name = "ANO_FABRICACAO")
    private Integer anoFabricacao;

    @Column(name = "ANO_MODELO")
    private Integer anoModelo;

    @Column(name = "COR")
    private String cor;

    @Column(name = "COMBUSTIVEL")
    private String combustivel;

    @NotNull
    @Column(name = "TIPO")
    private String tipo;

    @NotNull
    @Column(name = "CATEGORIA")
    private String categoria;

    @Column(name = "CHASSI")
    private String chassi;

    @Column(name = "PLACA")
    private String placa;

    @Column(name = "DATA_COMPRA")
    private Date dataCompra;

    @Column(name = "KM")
    private Integer km;

    @Column(name = "ORIGEM")
    private String origem;

    @NotNull
    @Column(name = "PRECO_CUSTO")
    private BigDecimal precoCusto;

    @NotNull
    @Column(name = "PRECO_VENDA")
    private BigDecimal precoVenda;

    @Column(name = "LUCRO")
    private BigDecimal lucro;

    @NotNull
    @Column(name = "QTDE")
    private Integer qtde;
}