package com.example.commerce.relatorio;

import com.example.commerce.configuration.LocalDateDeserializer;
import com.example.commerce.configuration.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "RELATORIO")
@Data
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "VLR")
    private BigDecimal vlr;

    @Column(name = "DATA")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate data;

    @Column(name = "ID_TRANS")
    private Integer idTransacao;
}
