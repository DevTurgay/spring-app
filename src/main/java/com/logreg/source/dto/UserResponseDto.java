package com.logreg.source.dto;

import com.logreg.source.models.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UserResponseDto {

    Integer id;

    String name;
    String surname;
    Integer age;

    String email;

    public static UserResponseDto from(User user){
        if(user == null)
            return null;

        return UserResponseDto.builder()
            .id(user.getId())
            .email(user.getEmail())
            .name(user.getName())
            .surname(user.getSurname())
            .age(user.getAge())
            .build();
    }

}
