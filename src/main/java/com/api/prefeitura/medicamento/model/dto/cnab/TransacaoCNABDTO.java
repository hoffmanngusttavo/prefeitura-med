package com.api.prefeitura.medicamento.model.dto.cnab;

import java.math.BigDecimal;

public record TransacaoCNABDTO(

        Integer tipo,
        String data,
        BigDecimal valor,
        Long cpf,
        String cartao,
        String hora,
        String donoDaLoja,
        String nomeDaLoja) {
}
