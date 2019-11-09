package com.team4demo.tweetIT_demo.controller;

import com.team4demo.tweetIT_demo.model.User;
import com.team4demo.tweetIT_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("user")
@RestController
public class UserCnt {
    @Autowired
    private UserService userService;

    @PostMapping(path= "", consumes = "application/json", produces = "application/json")
    public User addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }

    @GetMapping(path="{id}",produces = "application/json")
    public Optional<User> getUser(@PathVariable int id)
    {
        return userService.getUser(id);
    }

    @GetMapping(path="",produces = "application/json")
    public List<User> getAllUsers()
    {
        return userService.getUsers();
    }

    @PutMapping(path="",consumes = "application/json",produces = "application/json")
    public User updateUser(@RequestBody User user)
    {
        return userService.updateUser(user);
    }

    @DeleteMapping("{id}")
    public List<User> deleteUser(@PathVariable int id)
    {
        userService.deleteUser(id);
        return userService.getUsers();
    }
}
