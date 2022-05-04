package ru.netology.service;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturnRemainder100() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnZero() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnRemainderZero() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOneThousand() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 1000;

        assertEquals(actual,expected);
    }


}