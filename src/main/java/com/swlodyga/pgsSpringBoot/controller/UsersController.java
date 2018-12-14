package com.swlodyga.pgsSpringBoot.controller;

import com.swlodyga.pgsSpringBoot.model.Users;
import com.swlodyga.pgsSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
//@RequestMapping("users")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/rest/users/getall")
    public Page<Users> getUsers(Pageable pageable){
        return userRepository.findAll(pageable);
    }

    @GetMapping("/rest/users/{id}")
    public Optional<Users> getUsers(@PathVariable Long id){
        return userRepository.findById(id);
    }

    @PostMapping("/rest/users")
    public Users createUser(@Valid @RequestBody Users users){
        return userRepository.save(users);
    }


}
