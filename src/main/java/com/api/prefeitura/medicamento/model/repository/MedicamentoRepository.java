package com.api.prefeitura.medicamento.model.repository;

import com.api.prefeitura.medicamento.model.entity.Medicamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {


    @Query("""
            select m from Medicamento m where 1=1 and (m.dataUltimaAtualizacao > ?1 or ?1 is null)
            """)
    Page<Medicamento> findAllByDataUltimaAtualizacao(Pageable paginacao, LocalDateTime dataHora);
}
