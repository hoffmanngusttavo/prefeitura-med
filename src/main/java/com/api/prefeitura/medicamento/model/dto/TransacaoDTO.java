package com.api.prefeitura.medicamento.model.dto;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public record TransacaoDTO(

        Long id,
        Integer tipo,
        Date data,
        BigDecimal valor,
        Long cpf,
        String cartao,
        Time hora,
        String donoDaLoja,
        String nomeDaLoja) {

    public TransacaoDTO withData(String data) throws ParseException {
        var dateFormat = new SimpleDateFormat("yyyyMMdd");
        var dataFormatada = dateFormat.parse(data);
        return new TransacaoDTO(id, tipo, new Date(dataFormatada.getTime()), valor,
                cpf, cartao, hora, donoDaLoja, nomeDaLoja);
    }

    public TransacaoDTO withHour(String hora)  throws ParseException{
        var dateFormat = new SimpleDateFormat("HHmmss");
        var horaFormatada = dateFormat.parse(hora);
        return new TransacaoDTO(id, tipo, data, valor,
                cpf, cartao, new Time(horaFormatada.getTime()), donoDaLoja, nomeDaLoja);
    }


}
