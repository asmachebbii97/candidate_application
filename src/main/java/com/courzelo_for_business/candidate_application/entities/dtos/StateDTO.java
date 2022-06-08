package com.courzelo_for_business.candidate_application.entities.dtos;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class StateDTO {

	  private long idCandidateState; 
	  private Date stateDate;
	  private String label;
	  private int step;
	  private int score;
	  private String idPrehiringTest;
	  private List<String> idTest;
	  private String linkMeet;
	  private Date interviewDate;
	  private String offerDoc;
	  
	  private boolean testState;
	  public StateDTO() {}
	  
	  
}