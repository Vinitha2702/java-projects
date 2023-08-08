package com.voterapp.services;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class IElectionBoothImpl implements IElectionBooth{
	String[] localities= {"tandur","vikarabad"};
	@Override
	public boolean checkEligibility(int age, String loaclity, int VoterId) throws InValidVoterException {
		// TODO Auto-generated method stub
		try {
			if(checkAge(age))
				if(checkLocality(loaclity))
					if(checkVoterId(VoterId))
						return true;
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		} catch(LocalityNotFoundException e) {
			System.out.println("You are not from the following localities : ");
			int i = 1;
			for(String location : localities) {
				System.out.println(i + ". " +location);
				i++;
			}
		} catch(NoVoterIDException e) {
			System.out.println(e.getMessage());
		}
		throw new InValidVoterException("I'm sorry, You're not eligible.");
	}
	
	
	public boolean checkAge(int age) throws UnderAgeException {
		if(age < 18) {
			throw new UnderAgeException("You're below 18.");
		}
		return true;
	}
	
	public boolean checkLocality(String locality) throws LocalityNotFoundException {
		for(String location : localities) {
			if(location.toLowerCase().equals(locality.toLowerCase())) {
				return true;
			}
		}
		throw new LocalityNotFoundException();
	}
	
	public boolean checkVoterId(int voterId) throws NoVoterIDException{
		if(voterId >= 1000 && voterId <= 9999) {
			return true;
		}
		throw new NoVoterIDException("Your voter ID is Invalid.");
	}

}
