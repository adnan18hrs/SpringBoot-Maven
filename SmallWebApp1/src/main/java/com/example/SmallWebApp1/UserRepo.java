package com.example.SmallWebApp1;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

//Long is used bcz in UserRegistration Long is used for creating table in UID
//jpaRepository has some advance feature over crudRepository
public interface UserRepo extends JpaRepository<UserRegistration, Long> {
	
	@Query("from UserRegistration where lower(UName)=lower(:userName) order by UID desc")
	List<UserRegistration> selectRecordByName(@Param("userName") String name);
	
	//List<UserRegistration> findById(Long UID);
}
