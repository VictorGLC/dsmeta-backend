package com.victorglcosta.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorglcosta.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	

}
