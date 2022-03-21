package com.back.board.mapping;

import com.back.board.dto.PersonDto;
import com.back.board.model.Person;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-22T01:11:47+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.3.3.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class PersonMappingImpl extends PersonMapping {

    @Override
    public Person personDtoToPersonEntity(PersonDto dto) {
        if ( dto == null ) {
            return null;
        }

        Person person = new Person();

        person.setFirstName( dto.getFirstName() );
        person.setLastName( dto.getLastName() );
        person.setPatronymic( dto.getPatronymic() );
        person.setPhoneNumber( dto.getPhoneNumber() );
        person.setEmail( dto.getEmail() );
        person.setUsername( dto.getUsername() );
        person.setStatus( dto.getStatus() );
        person.setPassword( dto.getPassword() );
        person.setRole( dto.getRole() );

        return person;
    }
}
