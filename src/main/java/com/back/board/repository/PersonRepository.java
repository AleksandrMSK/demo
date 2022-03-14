package com.back.board.repository;

import com.back.board.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface PersonRepository extends JpaRepository<Person, String> {
}
