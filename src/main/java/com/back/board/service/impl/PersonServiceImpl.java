package com.back.board.service.impl;

import com.back.board.dto.PersonDto;
import com.back.board.mapping.PersonMapping;
import com.back.board.model.Person;
import com.back.board.model.UserRole;
import com.back.board.model.UserStatus;
import com.back.board.repository.PersonRepository;
import com.back.board.service.PersonService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonMapping personMapping;

    @Override
    public String saveNewPerson(PersonDto personDto) {

        Person person = personMapping.personDtoToPersonEntity(personDto);
        person.setRole(UserRole.USER_ROLE);
        person.setStatus(UserStatus.NEW);
        return personRepository.save(person).getStatus().name();
    }
}
