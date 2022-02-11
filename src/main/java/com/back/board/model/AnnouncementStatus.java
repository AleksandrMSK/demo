package com.back.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AnnouncementStatus {

    OPEN("Действующее объявление"),

    CLOSED("Закрыто пользователем"),

    MODERATION("На модерации"),

    REMOVED("Удалён пользователем"),

    REJECTED("Не прошёл модерацию")

    ;

    private final String title;
}
