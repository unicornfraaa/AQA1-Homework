package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    void remainAmount800() {
//        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(800);
        assertEquals(actual, 200);
    }
    @Test
    void remainAmountNegative() {
        int actual = service.remain(-100);
        assertEquals(actual,1100);
    }
    @Test
    void remainAmount0() {
        int actual = service.remain(0);
        assertEquals(actual,1000);
    }
    @Test
    void remainAmount1() {
        int actual = service.remain(1);
        assertEquals(actual,999);
    }
    @Test
    void remainAmount999() {
        int actual = service.remain(999);
        assertEquals(actual,1);
    }
    @Test
    void remainAmount1000() {
        int actual = service.remain(1000);
        assertEquals(actual,0);
    }
    @Test
    void remainAmount1001() {
        int actual = service.remain(1001);
        assertEquals(actual,999);
    }
    @Test
    void remainAmount8302() {
        int actual = service.remain(8302);
        assertEquals(actual,698);
    }
}