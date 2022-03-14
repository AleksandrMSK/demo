package com.back.board.mapping;

import com.back.board.dto.PersonDto;
import com.back.board.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PersonMapping {

    public abstract Person personDtoToPersonEntity(PersonDto dto);

}
