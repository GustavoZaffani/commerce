package com.example.commerce.venda;

import com.example.commerce.compra.Compra;
import com.example.commerce.pessoa.Pessoa;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

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

//    @ManyToMany
//    @NotNull
//    @JoinColumn(name = "ID_VEICULO")
//    private Compra compra;
}
