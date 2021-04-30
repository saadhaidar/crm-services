package com.fsdm.crm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsdm.crm.entities.Society;

public interface SocietyRepository extends JpaRepository<Society, Long> {
	
	Optional<Society> findById(Long id);

}
