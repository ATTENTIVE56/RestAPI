package com.gfg.amit.springdemo.userdata;

import com.gfg.amit.springdemo.model.User;

import java.util.HashMap;

public class UserData {
    public static HashMap<Long, User> userMap = new HashMap<>();

    static{
        User user0 = new User(0L,"Amit","Jaiswal");
        User user1 = new User(1L,"Ankit","Sharma");
        User user2 = new User(2L,"Janhavi","Srivastava");
        User user3 = new User(3L,"Raksha","Tripathi");
        userMap.put(user0.getId(),user0);
        userMap.put(user1.getId(),user1);
        userMap.put(user2.getId(),user2);
        userMap.put(user3.getId(),user3);
    }
}
