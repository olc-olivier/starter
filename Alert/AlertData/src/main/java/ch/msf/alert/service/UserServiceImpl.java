package ch.msf.alert.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ch.msf.alert.dao.UserRepository;
import ch.msf.alert.model.User;

public class UserServiceImpl implements UserService {
    
    static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;
 
    public User find(Long id) {
        User user = userRepository.findOne(id);
       // LOG.debug(user.);
        return user;
    }
}
