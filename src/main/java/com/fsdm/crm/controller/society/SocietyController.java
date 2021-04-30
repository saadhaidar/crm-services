package com.fsdm.crm.controller.society;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsdm.crm.controller.society.view.SocietyUpdateRequestView;
import com.fsdm.crm.controller.society.view.SocietyView;
import com.fsdm.crm.exception.society.SocietyBusinessException;

@RestController
@RequestMapping( path = "/society" )
public interface SocietyController {
	
	@GetMapping
	@RequestMapping("/find/{id}")
	@Valid
	@NotNull
	SocietyView findSocietyById(@PathVariable @NotNull  Long id) throws SocietyBusinessException;
	
	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	SocietyView createSociety(@RequestBody @NotNull @Valid SocietyView societyView);
	
	@PutMapping
	@RequestMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	void updateSociety(@RequestBody SocietyUpdateRequestView societyUpdateRequestView) throws Exception;
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	void deleteSociety(@PathVariable Long id);
}
