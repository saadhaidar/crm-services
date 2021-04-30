package com.fsdm.crm.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Society {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String member;
	
	private String commercialName;
	
	private String socialReason;
	
	private String rubrique;
	
	private String rubriqueSiege;
	
	private String subRubrique1;
	
	private String subRubrique2;
	
	private String teritoirre;

}
