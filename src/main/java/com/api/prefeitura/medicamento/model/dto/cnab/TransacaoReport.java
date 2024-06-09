package com.api.prefeitura.medicamento.model.dto.cnab;

import com.api.prefeitura.medicamento.model.entity.TransacaoCNAB;

import java.math.BigDecimal;
import java.util.List;

public record TransacaoReport(

        String nomeDaLoja,
        BigDecimal total,
        List<TransacaoCNAB> transacoes) {


    public TransacaoReport addTotal(BigDecimal valor){
        return new TransacaoReport(nomeDaLoja, total.add(valor), transacoes);
    }

    public TransacaoReport addTransacao(TransacaoCNAB transacao){
        transacoes.add(transacao);
        return new TransacaoReport(nomeDaLoja, total, transacoes);
    }

}
