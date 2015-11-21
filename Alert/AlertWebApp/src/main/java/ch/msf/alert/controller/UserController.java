package ch.msf.alert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.msf.alert.dao.UserRepository;
import ch.msf.alert.model.User;

@RestController
@RequestMapping("/user")
@EnableAutoConfiguration
public class UserController {

    @Autowired
    UserRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public User get(Long id) {
        User result = repository.findOne(id);
        return result;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserController.class, args);
    }

}