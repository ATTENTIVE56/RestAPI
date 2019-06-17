package com.gfg.amit.springdemo.controller;

import com.gfg.amit.springdemo.model.User;
import com.gfg.amit.springdemo.userdata.UserData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    HashMap<Long, User> userMap = UserData.userMap;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        for(Map.Entry<Long, User> entry : userMap.entrySet()){
            users.add(entry.getValue());
        }
        return users;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
        if(userMap.containsKey(id)){
            return userMap.get(id);
        }
        return null;
    }

    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable Long id){
        if(userMap.containsKey(id)){
            userMap.remove(id);
            return true;
        }
        return false;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        if(userMap.containsKey(user.getId())){
            userMap.put(user.getId(),user);
            return userMap.get(user.getId());
        }
        return null;
    }
    @PostMapping("/user")
    public Boolean createUser(@RequestBody User user){
        if(userMap.containsKey(user.getId())){
            return false;
        }else{
            userMap.put(user.getId(),user);
            return true;
        }
    }
}

