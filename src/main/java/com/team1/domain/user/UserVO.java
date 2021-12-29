package com.team1.domain.user;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserVO {

	private Integer id;
	private String location ;
	private String email;
	private String pw; 
	private String nickname;
	private LocalDate signupday; 
	private String profileurl; 
	private String introduce; 

	
}
