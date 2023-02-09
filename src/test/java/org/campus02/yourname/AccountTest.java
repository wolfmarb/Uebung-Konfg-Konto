package org.campus02.yourname;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account1;

    @BeforeEach
    void setUp() {
        account1 = new Account("Max Mustermann");
    }

    @Test
    void konstruktor() {
        Assertions.assertEquals("Max Mustermann",account1.getOwner());
        Assertions.assertEquals(100.00,account1.getAmount());

    }

    @Test
    void credit() {
        assertEquals(220.00, account1.credit(120));
    }

    @Test
    void debit() {
    }
}