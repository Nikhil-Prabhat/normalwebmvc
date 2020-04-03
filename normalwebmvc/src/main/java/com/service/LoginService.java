package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.LoginBean;

@Service
public class LoginService {

	public boolean validate(LoginBean bean) {

		String username = bean.getUserName();
		String password = bean.getPassword();
		if (username.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}
