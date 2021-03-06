package com.courzelo_for_business.candidate_application.entities.dtos;

import java.util.Date;
import java.util.List;

import com.courzelo_for_business.candidate_application.entities.JobOffers;
import com.courzelo_for_business.candidate_application.entities.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CandidateAppDTO {
	
	private String idCandidateApp;
    private Date applicationDate;
    private User user;
    private JobOffers job;
    private String cv;
    private List<String> idTest;
    private List<StateDTO> candidateState;
	public CandidateAppDTO() {}
	
	

    
}
