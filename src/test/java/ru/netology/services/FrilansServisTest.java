package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrilansServisTest {
    @Test
    public void testCalculatyeCase1() {
        FrilansServis servis = new FrilansServis();
        int actual = servis.calculate(10_000, 3_000, 20_000);
        int expenses = 3;
        Assertions.assertEquals(expenses, actual);
    }

    @Test
    public void testCalculatyeCase2() {
        FrilansServis servis = new FrilansServis();
        int actual = servis.calculate(100_000, 60_000, 150_000);
        int expenses = 2;
        Assertions.assertEquals(expenses, actual);


    }

}