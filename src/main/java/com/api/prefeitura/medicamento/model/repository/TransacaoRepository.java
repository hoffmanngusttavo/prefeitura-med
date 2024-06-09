package com.api.prefeitura.medicamento.model.repository;

import com.api.prefeitura.medicamento.model.entity.TransacaoCNAB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransacaoRepository extends JpaRepository<TransacaoCNAB, Long> {


    List<TransacaoCNAB> findAllByOrderByNomeDaLojaAscIdDesc();
}
