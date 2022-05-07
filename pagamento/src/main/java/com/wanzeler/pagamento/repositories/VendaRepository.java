package com.wanzeler.pagamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wanzeler.pagamento.entities.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{

}
