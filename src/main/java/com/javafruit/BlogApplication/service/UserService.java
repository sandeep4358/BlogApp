package com.javafruit.BlogApplication.service;

import com.javafruit.BlogApplication.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserService {
    public List<User> getUserDetails(){
      log.info("Entered");
        User user1 =  new User(12,"Sanjay");
        User user2 =  new User(13,"Rajan");
        User user3 =  new User(14,"Sam");
        User user4 =  new User(15,"Mark");
        List userList = new ArrayList();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.forEach(System.out::println);
        return  userList;

    }
}
