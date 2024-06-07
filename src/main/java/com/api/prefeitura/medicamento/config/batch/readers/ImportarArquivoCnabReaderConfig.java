package com.api.prefeitura.medicamento.config.batch.readers;

import com.api.prefeitura.medicamento.model.dto.TransacaoCNABDTO;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class ImportarArquivoCnabReaderConfig {


    @StepScope //pra conseguir injetar os parametros do job somente quando estiver disponivel
    @Bean
    FlatFileItemReader<TransacaoCNABDTO> importarArquivoCnabReader(
            @Value("#{jobParameters['cnabFile']}") Resource resource){

        return new FlatFileItemReaderBuilder<TransacaoCNABDTO>()
                .name("importarArquivoCnabReader")
                .resource(resource)
                .fixedLength()
                .columns(new Range(1,1), new Range(2,9),
                        new Range(10,19),new Range(20,30),
                        new Range(31,42), new Range(43,48),
                        new Range(49,62), new Range(63,80))
                .names("tipo", "data",
                        "valor", "cpf",
                        "cartao","hora",
                        "donoDaLoja", "nomeDaLoja")
                .targetType(TransacaoCNABDTO.class)
                .build();
    }

}
