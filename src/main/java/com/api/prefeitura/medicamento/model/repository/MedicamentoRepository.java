package com.api.prefeitura.medicamento.model.repository;

import com.api.prefeitura.medicamento.model.entity.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {


}
