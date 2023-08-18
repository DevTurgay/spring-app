package com.logreg.source.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreateDto {

    Long id;

    @NotBlank(message = "name can not be blank")
    String name;
    @NotBlank(message = "surname can not be blank")
    String surname;
    @NotNull(message = "age can not be null")
    Integer age;

    @Column(unique = true)
    @NotBlank(message = "email can not be blank")
    String email;

    @NotBlank(message = "password can not be blank")
    String password;
}
