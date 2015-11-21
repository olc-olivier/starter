package ch.msf.alert.dao;

import org.springframework.data.repository.CrudRepository;

import ch.msf.alert.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
