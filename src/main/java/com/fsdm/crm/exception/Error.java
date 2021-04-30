package com.fsdm.crm.exception;

import java.io.Serializable;

public interface Error extends Serializable {
	
	String getMessage();
	
	String name();

}
