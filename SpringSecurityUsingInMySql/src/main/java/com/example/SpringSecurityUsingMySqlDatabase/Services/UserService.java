package com.example.SpringSecurityUsingMySqlDatabase.Services;


import java.util.List;

import com.example.SpringSecurityUsingMySqlDatabase.Modal.User;

public interface UserService {

	public User register(User request);

	public List<User> getUsers();

}
