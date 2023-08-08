package com.voterapp.client;

import java.util.Scanner;


import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.services.IElectionBooth;
import com.voterapp.services.IElectionBoothImpl;

public class VoterAppMain {

	public static void main(String[] args) throws InValidVoterException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the age");
		int age=scanner.nextInt();
		System.out.println("enter the locality");
		String locality=scanner.next();
		System.out.println("enter the voterid");
		int voterId=scanner.nextInt();
		
		IElectionBooth electionBooth=new IElectionBoothImpl();
		try {
			if(electionBooth.checkEligibility(age, locality, voterId)) {
				System.out.println("You are ready to avail your vote. Now you can Vote.");
			}
		} catch (InValidVoterException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Closing...");
		}
		
		
		scanner.close();
	}

}
