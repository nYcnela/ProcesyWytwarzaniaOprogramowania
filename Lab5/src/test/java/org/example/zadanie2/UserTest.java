package org.example.zadanie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @Test
    void groupedAssertions() {
        User user = new User("Nowak", "Paweł");

        assertAll("User name checks",
                () -> assertEquals("Paweł", user.getFirstName(), "First name should be Paweł"),
                () -> assertEquals("Paweł", user.getLastName(), "Last name should be Paweł")
        );
    }
}
