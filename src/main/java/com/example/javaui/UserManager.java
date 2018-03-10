package com.example.javaui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {

  @Autowired
  UserNameRepository userNameRepository;

  public void setName(String firstName, String lastName) {
    userNameRepository.save(new UserName(firstName, lastName));
    System.out.println(userNameRepository.findAllByFirstName(firstName));
  }
}
