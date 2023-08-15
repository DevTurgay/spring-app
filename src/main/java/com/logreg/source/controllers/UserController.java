package com.logreg.source.controllers;

import com.logreg.source.dto.UserCreateDto;
import com.logreg.source.dto.UserLoginDto;
import com.logreg.source.dto.UserResponseDto;
import com.logreg.source.models.User;
import com.logreg.source.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final User user;
    private final UserRepository userRepository;

    @PostMapping("/login")
    public User getUserById(@RequestBody UserLoginDto userLoginDto) {
        Optional<User> result = userRepository.findByEmailAndPassword(userLoginDto.getEmail(), userLoginDto.getPassword());
        if(result.isEmpty())
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);

        return result.get();
    }

    @PostMapping("/register")
    public UserResponseDto saveUser(@RequestBody UserCreateDto userCreateDto){
        User user = userRepository.save(User.builder()
            .name(userCreateDto.getName())
            .surname(userCreateDto.getSurname())
            .age(userCreateDto.getAge())
            .email(userCreateDto.getEmail())
            .password(userCreateDto.getPassword())
            .build()
        );

        return UserResponseDto.from(user);
    }
}
