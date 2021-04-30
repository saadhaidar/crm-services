package com.fsdm.crm.controller.society;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fsdm.crm.controller.society.view.SocietyUpdateRequestView;
import com.fsdm.crm.controller.society.view.SocietyView;
import com.fsdm.crm.entities.Society;
import com.fsdm.crm.exception.society.SocietyBusinessException;
import com.fsdm.crm.services.SocietyService;

@Component
public class SocietyControllerImpl implements SocietyController {

	@Autowired
	private SocietyService societyService;
	
	
	@Override
	public SocietyView findSocietyById(Long id) throws SocietyBusinessException {
		return SocietyView.from(societyService.findSocietyById(id));
	}

	@Override
	public SocietyView createSociety(SocietyView society) {
		return SocietyView.from(societyService.createSociety(SocietyView.to(society)));
	}

	@Override
	public void updateSociety(SocietyUpdateRequestView societyRequestView) throws Exception {
		Society society = societyService.findSocietyById(societyRequestView.getId());
		society.setCommercialName(societyRequestView.getCommercialName());
		societyService.updateSociety(society);
	}

	@Override
	public void deleteSociety(Long id) {
		societyService.deleteSociety(id);
	}

}
