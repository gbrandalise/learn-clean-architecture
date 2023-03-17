package infra.adapter;

import javax.annotation.Generated;

import br.com.domain.entity.User;
import br.com.infra.adapter.UserMapper;
import br.com.infra.jpa.entity.UserJpa;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-17T17:53:15-0300",
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
