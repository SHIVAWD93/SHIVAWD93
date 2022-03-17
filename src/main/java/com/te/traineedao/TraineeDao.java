 package com.te.traineedao;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.te.trainee.Trainee;

@Repository
public class TraineeDao {
	EntityManagerFactory factory =	Persistence.createEntityManagerFactory("CRUD");
	 EntityManager    manger=factory.createEntityManager();
	 boolean temp = false;
 public boolean getDto(Trainee trainee) {
	manger.getTransaction().begin();
	manger.persist(trainee);
	manger.getTransaction().commit();
	temp=true;
	return temp;
	}
 
 public Trainee fetchDto(int id) {
	 manger.getTransaction().begin();
Trainee train=		manger.find(Trainee.class, id);
		manger.getTransaction().commit();
	return train;
 }
 
 public boolean deleteDto(int id) {
	Trainee traine= manger.find(Trainee.class, id);
	manger.remove(traine);
	manger.flush();
	manger.getTransaction().commit();
	temp=true;
	return temp;
 }
 
 public boolean findData(int id) { 
	 manger.getTransaction().begin();
	Trainee traine= manger.find(Trainee.class, id);
	temp=true;
	 return temp;
	 }
 
 public boolean faceBookdto(int id,String pwd) {
		Trainee traine= manger.find(Trainee.class, id);
		if (traine.getPwd().equals(pwd)) {
			return true;
		}
		else {
			return false;
		}
 }
 public boolean getUpdate(String pwd,int id,String email,String number) {
	 manger.getTransaction().begin();
	 Trainee traine= manger.find(Trainee.class, id);
traine.setPwd(pwd);
traine.setEmail(email);
traine.setNumber(number);
manger.merge(traine); 
manger.getTransaction().commit();
temp=true;
return temp;
		
 }
}
