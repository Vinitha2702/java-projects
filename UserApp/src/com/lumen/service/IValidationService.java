package com.lumen.service;

import com.lumen.exception.NameExistsException;
import com.lumen.exception.TooLongException;
import com.lumen.exception.TooShortException;

public interface IValidationService {
	boolean validateUsername(String username) throws NameExistsException;
	boolean validatePassword(String password) throws TooShortException,TooLongException;
}
