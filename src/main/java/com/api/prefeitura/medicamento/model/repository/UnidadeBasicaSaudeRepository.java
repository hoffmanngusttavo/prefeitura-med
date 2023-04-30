package com.api.prefeitura.medicamento.model.repository;

import com.api.prefeitura.medicamento.model.entity.UnidadeBasicaSaude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeBasicaSaudeRepository extends JpaRepository<UnidadeBasicaSaude, Long> {


}
