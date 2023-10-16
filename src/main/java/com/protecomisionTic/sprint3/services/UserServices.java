package com.protecomisionTic.sprint3.services;

import com.protecomisionTic.sprint3.entity.Enterprises;
import com.protecomisionTic.sprint3.entity.Users;
import com.protecomisionTic.sprint3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<Users> getUsers(){
        return userRepository.findAll();
    }

    public Users getUserById (Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public Users saveUser (Users user){
    return userRepository.save(user);
    }

    public List<Users> saveUsers(List<Users> users){
        return userRepository.saveAll(users);
    }

    public Users updateUser (Users user){
        Users existingUser = userRepository.findById(user.getId()).orElse(null);
        existingUser.setEmail(user.getEmail());
        existingUser.setCompanyEmployee(user.getCompanyEmployee());
        existingUser.setEmployeeName(user.getEmployeeName());
        existingUser.setRol(user.getRol());
        return userRepository.save(existingUser);
    }

    public String deleteUser (Integer id){
        userRepository.deleteById(id);
        return "Has Eliminado el Empleado con ID: " + id;
    }
}
