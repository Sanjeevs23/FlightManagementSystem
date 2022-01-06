package com.cg.flightmgmt.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.flightmgmt.dto.User;

public interface UserService {
	public User addUser(User user);
	public User viewUser(BigInteger userId);
	public List<User> viewUser();
	public void validateUser(User user);
	public User updateUser(User user);
	public void deleteUser(BigInteger userId);
}
