package com.example.commerce.venda;

import com.example.commerce.configuration.LocalDateDeserializer;
import com.example.commerce.configuration.LocalDateSerializer;
import com.example.commerce.pessoa.Pessoa;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "VENDAS")
@Data
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "VLR_TOTAL")
    private BigDecimal vlrTotal;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "ID_CLIENTE")
    private Pessoa cliente;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "ID_VENDEDOR")
    private Pessoa vendedor;

    @Column(name = "DATA_VENDA")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate dataVenda;

//    @JsonManagedReference
//    @OrderBy("id")
//    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
//    private List<ItemVenda> vendaItemList;

}