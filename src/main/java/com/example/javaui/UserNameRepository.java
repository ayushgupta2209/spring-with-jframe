package com.example.javaui;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserNameRepository  extends MongoRepository<UserName, String> {
  public List<UserName> findAllByFirstName(String firstName);
  public List<UserName> findAllByLastName(String lastName);
  public UserName findUserNameById(String id);

}
