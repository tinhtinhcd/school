package com.ms.profile.service;

import com.ms.profile.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IService {
    User createUser(User user);
    List<User> getAllUser();
    User getUserById(long id);

}
