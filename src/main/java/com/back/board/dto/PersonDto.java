package com.back.board.dto;

import com.back.board.model.UserRole;
import com.back.board.model.UserStatus;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PersonDto {

    private String firstName;

    private String lastName;

    private String patronymic;

    private String phoneNumber;

    private String email;

    private String username;

    private UserStatus status;

    private String password;

    private UserRole role;
}
