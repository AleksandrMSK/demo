package com.back.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserRole {

    ADMIN_ROLE("Admin"),

    MODERATOR_ROLE("Moderator"),

    USER_ROLE("User");

    private final String title;

}
