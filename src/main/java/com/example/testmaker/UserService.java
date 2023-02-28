package com.example.testmaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository ;
    public Person createUser(Person person){
        return userRepository.save(person) ;
    }
    public void deleteUser(Person person){
        userRepository.delete(person);
    }
    public List<Person> getListOfAllUser(){
        return (List<Person>) userRepository.findAll();
    }
    public Person findUserById(long id){
        return userRepository.findById(id).orElse(null) ;
    }
}
