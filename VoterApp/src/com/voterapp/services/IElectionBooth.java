package com.voterapp.services;

import com.voterapp.exception.InValidVoterException;

public interface IElectionBooth {
	boolean checkEligibility(int age,String loaclity,int VoterId) throws InValidVoterException;
}
