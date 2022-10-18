package com.javapractice.demo.controller;

import com.javapractice.demo.dao.RoleRepository;
import com.javapractice.demo.dao.UserRepository;
import com.javapractice.demo.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;


@RequestMapping("/users")
@RestController
public class UserRestController {

    private final UserRepository userRepository;

    @Autowired
    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Users> getAll(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Users getById (@PathVariable("id") UUID id){
        return userRepository.findById(id).get();
    }

    @PutMapping
    public Users update (@RequestBody Users user){
        if(userRepository.existsById (user.getId())) {
            return userRepository.save(user);
        }
        throw new EntityExistsException("User with id:'"+ user.getId() +"' doesn't exists");
    }

    @PostMapping
    public Users create(@RequestBody Users user){
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void remove (@PathVariable("id") UUID id){
        userRepository.deleteById(id);
    }
}
