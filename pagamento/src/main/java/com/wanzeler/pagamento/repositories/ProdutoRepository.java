package com.wanzeler.pagamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wanzeler.pagamento.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
