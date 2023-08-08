package com.lumen.client;

import java.util.Scanner;


import com.lumen.exception.NameExistsException;
import com.lumen.exception.TooLongException;
import com.lumen.exception.TooShortException;
import com.lumen.service.IValidationService;
import com.lumen.service.ValidationServiceImpl;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter username");
		String Username=scanner.nextLine();
		IValidationService validationService=new ValidationServiceImpl();
		try {
			if(validationService.validateUsername(Username)) {
				String password =scanner.nextLine();
				if(validationService.validatePassword(password)) {
					System.out.println("welcome");
					System.out.println("registered successful");
				}
			}
		}catch(NameExistsException e) {
			System.out.println(e.getMessage());
		}catch(TooLongException e) {
			System.out.println(e.getMessage());
		}catch(TooShortException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("closing...");
		}
		
	}

}
