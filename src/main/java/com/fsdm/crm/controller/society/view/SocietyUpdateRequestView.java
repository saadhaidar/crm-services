package com.fsdm.crm.controller.society.view;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SocietyUpdateRequestView {
	
	@NotNull
	private Long id;
	
	@NotEmpty
	private String commercialName;
}
