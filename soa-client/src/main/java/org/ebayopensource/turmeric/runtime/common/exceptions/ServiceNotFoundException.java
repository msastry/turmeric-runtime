/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.common.exceptions;


import org.ebayopensource.turmeric.common.v1.types.CommonErrorData;


/**
 * Exception that is thrown when an error occur during service creation process.
 * 
 * @author smalladi
 */
public class ServiceNotFoundException extends ServiceException {

	
	/**
	 * @param errorData The CommonErrorData to be reported by the exception.
	 */
	public ServiceNotFoundException(CommonErrorData errorData) {
		super(errorData);
	}
	
	/**
	 * @param errorData The CommonErrorData to be reported by the exception.
	 * @param cause A Throwable providing the cause of this exception.
	 */
	public ServiceNotFoundException(CommonErrorData errorData, Throwable cause) {
		super(errorData, cause);
	}

	/**
	 * serial version UID.
	 */
	static final long serialVersionUID = 835486766282112209L;
}
