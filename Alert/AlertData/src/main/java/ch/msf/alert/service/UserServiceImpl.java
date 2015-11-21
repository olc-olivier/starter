package ch.msf.alert.service;

import org.springframework.beans.factory.annotation.Autowired;

import ch.msf.alert.dao.UserRepository;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
}
