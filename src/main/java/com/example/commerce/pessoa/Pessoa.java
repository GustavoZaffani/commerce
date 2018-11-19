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
    private Integer id;

    @NotNull
    @Column(name = "NOME")
    private String nome;

    @Column(name = "SEXO")
    private String sexo;

    @Column(name = "ESTADO_CIVIL")
    private String estadoCivil;

    @NotNull
    @Column(name = "CATEGORIA")
    private String categoria;

    @NotNull
    @Column(name = "TIPO_PESSOA")
    private String tipoPessoa;

    @NotNull
    @Column(name = "CPF_CNPJ")
    private Long cpfCnpj;

    @Column(name = "RG")
    private Long rg;

    @Column(name = "IE")
    private Long ie;

    @NotNull
    @Column(name = "CEP")
    private String cep;

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
    private String telCel;

    @Column(name = "TEL_RES")
    private String telRes;

    @Column(name = "EMAIL")
    private String email;
}
