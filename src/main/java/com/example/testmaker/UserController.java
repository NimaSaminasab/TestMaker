package com.example.testmaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService ;

    @GetMapping("/getAllUsers")
    public List<Person> getAllUsers(){
        return userService.getListOfAllUser();
    }

    @PostMapping("/createUser")
    public void createUser(@RequestBody Person person){
        userService.createUser(person) ;
    }

    @PutMapping("/editUser/{id}")
    public void editUser(@PathVariable long id,@RequestBody Person person){
        Person personToEdit = userService.findUserById(id) ;
        personToEdit.setName(person.getName());
        userService.createUser(personToEdit) ;
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable long id){
        Person person = userService.findUserById(id);
        if(person != null)
            userService.deleteUser(person);
    }


}
