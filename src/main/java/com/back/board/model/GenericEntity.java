package com.back.board.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class GenericEntity {

    @Column(name = "time_create", updatable = false)
    private LocalDateTime createTime;

    @Column(name = "time_update")
    private LocalDateTime updateTime;

}
