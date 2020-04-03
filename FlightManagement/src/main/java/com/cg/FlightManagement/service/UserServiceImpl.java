package com.cg.FlightManagement.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.FlightManagement.dto.User;


public class UserServiceImpl implements UserService{

	
	List<User> userList=new ArrayList<User>();
	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		userList.add(u);
	}

	/*
	@Override
	public User viewUserById(int userId) {
		
		// TODO Auto-generated method stub
		User u1;
		boolean check=checkUserId(userId);
		if(check) {
			return u1;
		}
		
	}
	
	public boolean checkUserId(int userId) {
		boolean available=false;
		for(User u1:userList) {
			if(u1.getUserId()==userId) {
				available=true;
				break;
			}	
		}
		return available;
	}

*/
	@Override
	public List<User> viewUser() {
		// TODO Auto-generated method stub
		return userList;
	}

	@Override
	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		boolean available=false;
		for(User u1:userList) {
			if(u1.getUserId()==userId) {
				userList.remove(u1);
				available=true;
				break;
			}
		}
		return available;
	}

	@Override
	public boolean updateUser(int userId, String updateUserName, int updateUserPhone, String updateUserEmail) {
		// TODO Auto-generated method stub
		boolean available=false;
		for(User u1:userList) {
			if(u1.getUserId()==userId) {
				u1.setUserName(updateUserName);
				u1.setUserPhone(updateUserPhone);
				u1.setUserEmail(updateUserEmail);
				available=true;
				break;
			}
		}
		return available;
		
	}

	@Override
	public void validateUser(User u) {
		// TODO Auto-generated method stub
		
	}
	
}

