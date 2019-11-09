package com.team4demo.tweetIT_demo.service;

import com.team4demo.tweetIT_demo.model.User;
import com.team4demo.tweetIT_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
    public User addUser(User user)
    {
        return userRepository.save(user);
    }
    public Optional<User> getUser(int id)
    {
        return userRepository.findById(id);
    }
    public User updateUser(User user)
    {
        return userRepository.save(user);
    }
    public void deleteUser(int id)
    {
        userRepository.deleteById(id);
    }


}
