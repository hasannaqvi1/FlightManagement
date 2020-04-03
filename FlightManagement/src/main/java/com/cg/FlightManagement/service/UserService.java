package com.cg.FlightManagement.service;


import java.util.List;

import com.cg.FlightManagement.dto.User;


public interface UserService {
	public void addUser(User u);
	//public User viewUserById(int userId);
	public List<User> viewUser();
	public boolean deleteUser(int userId);
	public boolean updateUser(int userId,String updateUserName,int uupdateUserPhone,String updateUserEmail);
	public void validateUser(User u);
}

