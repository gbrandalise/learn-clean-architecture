package br.com.infra.repository;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.app.repository.UserRepository;
import br.com.domain.entity.User;
import br.com.infra.adapter.UserMapper;
import br.com.infra.jpa.entity.UserJpa;
import br.com.infra.jpa.repository.UserJpaRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserServiceRepository implements UserRepository {

    @NonNull private UserJpaRepository userJpaRepository;

    @Override
    public void insert(User user) {
        UserJpa entity = UserMapper.INSTANCE.toJpa(user);
        userJpaRepository.save(entity);
    }

    @Override
    public Optional<User> findByUserName(String username) {
        Optional<UserJpa> entity = userJpaRepository.findByUsername(username);
        return entity.map(UserMapper.INSTANCE::toEntity);
    }
    
}
