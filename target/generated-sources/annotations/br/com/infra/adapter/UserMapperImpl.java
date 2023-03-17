package br.com.infra.adapter;

import br.com.domain.entity.User;
import br.com.infra.jpa.entity.UserJpa;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-17T18:06:55-0300",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserJpa toJpa(User user) {
        if ( user == null ) {
            return null;
        }

        UserJpa userJpa = new UserJpa();

        userJpa.setPassword( user.getPassword() );
        userJpa.setUsername( user.getUsername() );

        return userJpa;
    }

    @Override
    public User toEntity(UserJpa entity) {
        if ( entity == null ) {
            return null;
        }

        String username = null;
        String password = null;

        username = entity.getUsername();
        password = entity.getPassword();

        User user = new User( username, password );

        return user;
    }
}
