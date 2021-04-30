package com.fsdm.crm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsdm.crm.entities.Society;
import com.fsdm.crm.exception.society.SocietyBusinessException;
import com.fsdm.crm.repository.SocietyRepository;

@Service
public class SocietyServiceImpl implements SocietyService {

	@Autowired
	private SocietyRepository societyRepository;
	@Override
	public Society findSocietyById(Long id) throws SocietyBusinessException {
		return societyRepository.findById(id).orElseThrow(() -> new SocietyBusinessException(SocietyBusinessException.SocietyError.SOCIETY_NOT_FOUND));
	}

	@Override
	public Society createSociety(Society society) {
		return societyRepository.save(society);
	}

	@Override
	public Society updateSociety(Society society) {
		return societyRepository.save(society);
	}

	@Override
	public void deleteSociety(Long id) {
		societyRepository.deleteById(id);
		
	}

}
