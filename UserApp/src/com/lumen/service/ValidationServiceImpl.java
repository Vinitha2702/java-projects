package com.lumen.service;

import com.lumen.exception.NameExistsException;
import com.lumen.exception.TooLongException;
import com.lumen.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		// TODO Auto-generated method stub
		String[] usernames = {"vinitha","vyshu","sonu","hari"};
		for(String user:usernames) {
			if(user.equalsIgnoreCase(username)) {
				throw new NameExistsException("name exists");
			}
		}
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		// TODO Auto-generated method stub
		if(password.length()>8) {
			throw new TooLongException("password length is toolong");
		}
		if(password.length()<3) {
			throw new TooShortException("password length is tooshort");
		}
		return true;
	}
	
}
