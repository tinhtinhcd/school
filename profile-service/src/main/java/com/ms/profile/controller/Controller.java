package com.ms.profile.controller;

import com.ms.profile.model.User;
import com.ms.profile.service.IService;
import com.ms.profile.service.imp.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class Controller {

    ProfileService service;

    @Autowired
    public Controller(ProfileService service) {
        this.service = service;
    }

    @PostMapping("create")
    public User createUser(@RequestParam User user){
        return service.createUser(user);
    }

    @GetMapping("all")
    private List<User> getAll(){
        return service.getAllUser();
    }

}
