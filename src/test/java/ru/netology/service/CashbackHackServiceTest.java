package ru.netology.service;
import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    void remainAmount800() {
//        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);
        assertEquals(200, actual);
    }
    @Test
    void remainAmountNegative() {
        int actual = service.remain(-100);
        assertEquals(1100, actual);
    }
    @Test
    void remainAmount0() {
        int actual = service.remain(0);
        assertEquals(1000, actual);
    }
    @Test
    void remainAmount1() {
        int actual = service.remain(1);
        assertEquals(999, actual);
    }
    @Test
    void remainAmount999() {
        int actual = service.remain(999);
        assertEquals(1, actual);
    }
    @Test
    void remainAmount1000() {
        int actual = service.remain(1000);
        assertEquals(0, actual);
    }
    @Test
    void remainAmount1001() {
        int actual = service.remain(1001);
        assertEquals(999, actual);
    }
    @Test
    void remainAmount8302() {
        int actual = service.remain(8302);
        assertEquals(698, actual);
    }
}