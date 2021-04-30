package com.fsdm.crm.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BusinessException extends RuntimeException {
	private String code;
	private Error error;
	
}
