package com.fsdm.crm.services;

import com.fsdm.crm.entities.Society;
import com.fsdm.crm.exception.society.SocietyBusinessException;

public interface SocietyService {
	
	
	Society findSocietyById(Long id) throws SocietyBusinessException;
	
	Society createSociety(Society society);
	
	Society updateSociety(Society society);
	
	void deleteSociety(Long id);
	

}
