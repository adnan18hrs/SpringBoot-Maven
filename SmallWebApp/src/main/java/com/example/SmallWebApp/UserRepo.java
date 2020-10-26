//package dao;
package com.example.SmallWebApp;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

//Long is used bcz in UserRegistration Long is used for creating table in UID
public interface UserRepo extends CrudRepository<UserRegistration, Long> {
	List<UserRegistration> findByUName(String name);
}
