package br.com.infra.adapter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.com.domain.entity.User;
import br.com.infra.jpa.entity.UserJpa;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id", ignore = true)
    UserJpa toJpa(User user);

    User toEntity(UserJpa entity);
    
}
