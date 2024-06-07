package com.api.prefeitura.medicamento.config.batch.writers;

import com.api.prefeitura.medicamento.model.dto.TransacaoDTO;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ImportarArquivoCnabWriterConfig {

    @Bean
    JdbcBatchItemWriter<TransacaoDTO> importarArquivoCnabWriter(DataSource dataSource){

        return new JdbcBatchItemWriterBuilder<TransacaoDTO>()
                .dataSource(dataSource)
                .sql("""
                        INSERT INTO transacao (
                            tipo, data, valor, cpf, cartao,
                            hora, dono_loja, nome_loja
                        ) VALUES (
                            :tipo, :data, :valor, :cpf, :cartao,
                            :hora, :donoDaLoja, :nomeDaLoja
                        )
                        """)
                .beanMapped()
                .build();

    }

}
