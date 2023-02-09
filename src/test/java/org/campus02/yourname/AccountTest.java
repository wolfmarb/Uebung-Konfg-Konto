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
    void multicredit() {
        account1.credit(110.00);
        assertEquals(210.00, account1.getAmount());
        account1.credit(120.00);
        assertEquals(330.00,account1.getAmount());
        account1.credit(130.00);
        assertEquals(460.00,account1.getAmount());

    }

    @Test
    void debit90() {
        assertTrue(account1.debit(90.00));
        assertEquals(10.00, account1.getAmount());
    }
    @Test
    void debit100() {
        assertTrue(account1.debit(100.00));
        assertEquals(0.00, account1.getAmount());
    }

    @Test
    void debit120() {
        assertFalse(account1.debit(120.00));
        assertEquals(100.00, account1.getAmount());
    }

}