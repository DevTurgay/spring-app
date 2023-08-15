package com.logreg.source.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserLoginDto {
    @NotBlank(message = "email can not be blank")
    String email;
    @NotBlank(message = "password can not be blank")
    String password;
}
