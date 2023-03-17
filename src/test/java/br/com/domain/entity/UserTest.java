package br.com.domain.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.domain.exception.PasswordStrengthException;
import br.com.domain.exception.UsernameLengthException;

class UserTest {

    @Test
    void testInstance() {
        User user = new User("username", "ABCabc1!");
        assertNotNull(user);
        assertEquals("username", user.getUsername());
    }

    @Test
    void testInstanceInvalidUsername() {
        assertThrows(
            UsernameLengthException.class, 
            () -> new User("usernam", "ABCabc1!")
        );
    }

    @Test
    void testInstancePasswordInvalidLength() {
        assertThrows(
            PasswordStrengthException.class, 
            () -> new User("username", "ABCab1!")
        );
    }
    
}
