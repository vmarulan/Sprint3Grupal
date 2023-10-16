package com.protecomisionTic.sprint3.controllers;

import com.protecomisionTic.sprint3.entity.Users;
import com.protecomisionTic.sprint3.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UserServices userServices;

    @PostMapping("/addUser")
    public Users saveUser(@RequestBody Users user){
        return userServices.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<Users> saveUsers(@RequestBody List<Users> users){
        return userServices.saveUsers(users);
    }

    @GetMapping("/users")
    public List<Users> findAllUsers(){
        return userServices.getUsers();
    }

    @GetMapping("/user/{id}")
    public  Users findById (@PathVariable Integer id) {
        return userServices.getUserById(id);
    }

    @PutMapping("/editUser")
    public Users editUser (@RequestBody Users user){
        return userServices.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser (@PathVariable Integer id) {
        return  userServices.deleteUser(id);
    }

    }
