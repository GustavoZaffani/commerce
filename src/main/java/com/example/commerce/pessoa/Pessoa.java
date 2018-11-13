package com.example.commerce.pessoa;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "PESSOA")
@Data
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotNull
    @Column(name = "NOME")
    private String nome;

    @Column(name = "SEXO")
    private String sexo;

    @Column(name = "ESTADO_CIVIL")
    private String estado_civil;

    @NotNull
    @Column(name = "CATEGORIA")
    private String categoria;

    @NotNull
    @Column(name = "TIPO_PESSOA")
    private String tipo_pessoa;

    @Column(name = "CPF_CNPJ")
    private Long cpf_cnpj;

    @Column(name = "RG")
    private Long rg;

    @Column(name = "IE")
    private Long ie;

    @NotNull
    @Column(name = "CEP")
    private Long cep;

    @NotNull
    @Column(name = "ENDERECO")
    private String endereco;

    @Column(name = "COMPLEMENTO")
    private String complemento;

    @Column(name = "NRO")
    private Integer nro;

    @NotNull
    @Column(name = "CIDADE")
    private String cidade;

    @NotNull
    @Column(name = "BAIRRO")
    private String bairro;

    @NotNull
    @Column(name = "UF")
    private String uf;

    @NotNull
    @Column(name = "TEL_CEL")
    private Long telCel;

    @Column(name = "TEL_RES")
    private Long telRes;

    @Column(name = "EMAIL")
    private String email;
}
