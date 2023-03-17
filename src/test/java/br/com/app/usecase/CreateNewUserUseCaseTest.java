package br.com.app.usecase;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.app.repository.UserMemoryRepository;
import br.com.app.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class CreateNewUserUseCaseTest {

    CreateNewUserUseCase useCase;
    @Spy UserRepository userRepository = new UserMemoryRepository();

    @BeforeEach
    void setUp() {
        useCase = new CreateNewUserUseCase(userRepository);
    }

    @Test
    void testInstance() {
        assertNotNull(useCase);
    }

    @Test
    void testCreateNewUser() {
        useCase.execute("username", "ABCabc1!");
        verify(userRepository).insert(any());
    }
    
}
