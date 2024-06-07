package com.api.prefeitura.medicamento.model.entity;

import com.api.prefeitura.medicamento.model.dto.TransacaoCNABDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "transacao")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TransacaoCNAB {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer tipo;

    private LocalDate data;

    private BigDecimal valor;

    private Long cpf;

    private String cartao;

    private LocalTime hora;

    private String donoDaLoja;

    private String nomeDaLoja;


    public TransacaoCNAB construct(TransacaoCNABDTO item) {

        this.id = null;
        this.tipo = item.tipo();
        this.cpf = item.cpf();
        this.cartao = item.cartao();
        this.donoDaLoja = item.donoDaLoja();
        this.nomeDaLoja = item.nomeDaLoja();

        return this;
    }

    public TransacaoCNAB withValor(BigDecimal valorFormatado) {
        this.valor = valorFormatado;
        return this;
    }

    public TransacaoCNAB withData(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        this.data = LocalDate.parse(data, formatter);
        return this;
    }

    public TransacaoCNAB withHour(String hora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        this.data = LocalDate.parse(hora, formatter);
        return this;
    }
}
