package pers.me.pharmacy.service.impl;

import org.springframework.stereotype.Service;

import pers.me.pharmacy.bean.User;
import pers.me.pharmacy.service.UserService;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService{

}
