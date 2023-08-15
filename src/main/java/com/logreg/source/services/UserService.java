package com.logreg.source.services;

import com.logreg.source.models.User;
import com.logreg.source.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    public void saveUser(User user){
        userRepository.save(user);
    }
}
