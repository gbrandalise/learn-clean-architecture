package br.com.infra.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.infra.jpa.entity.UserJpa;

@Repository
public interface UserJpaRepository extends JpaRepository<UserJpa, Long> {

    Optional<UserJpa> findByUsername(String username);
    
}
