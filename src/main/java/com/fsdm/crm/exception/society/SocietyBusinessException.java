package com.fsdm.crm.exception.society;

import com.fsdm.crm.exception.BusinessException;
import com.fsdm.crm.exception.Error;

import lombok.Data;

@Data
public class SocietyBusinessException extends BusinessException {


	public SocietyBusinessException(SocietyError error) {
		super(error.getMessage(),error);
	}


	public enum SocietyError implements Error{
		SOCIETY_NOT_FOUND;

		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return this.name();
		}
	}
}
