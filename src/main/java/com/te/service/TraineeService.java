package com.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.mycustomexception.InValidPasswordException;
import com.te.trainee.Trainee;
import com.te.traineedao.TraineeDao;
import com.te.mycustomexception.*;
@Service
public class TraineeService {
	
	@Autowired
private TraineeDao traineedao;
	
	public boolean addTrainee(Trainee trainee) {
		if(trainee.getPwd().equals(trainee.getEmail())) {
			throw new InValidPasswordException("you can not have same userName and Password");
		}
		return traineedao.getDto(trainee);		
	}
	public Trainee fetchData(int id) {
	return traineedao.fetchDto(id);	
	}
	public boolean deleteOperation(int id) {
		if(traineedao.findData(id)) {
		
			return traineedao.deleteDto(id);
		}		
		else {
			throw new InValidPasswordException("Entered Employee Id is present in the DataBase");
		}
	}
	public boolean facebookddto(int id, String pwd) {
		if(traineedao.faceBookdto(id, pwd)) {
			return traineedao.faceBookdto(id, pwd);
		}
		else {
			throw new InValidPasswordException("Invalid credentials");
		}
	
	}
	public boolean facebookupdate(int id,String pwd,String email,String number) {
	if(traineedao.getUpdate(pwd, id,email,number)) {
		return traineedao.getUpdate(pwd, id,email,number);
	}else {
		throw new InValidPasswordException("Unable to Update the Account");
	}
	}
	}