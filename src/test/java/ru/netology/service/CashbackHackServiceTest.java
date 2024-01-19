package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldHowMuchBuyIfPurchaseLess1000() {
        CashbackHacService cashbackHacService = new CashbackHacService();
        int amount = 900;
        int actual = cashbackHacService.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchBuyIfPurchase0() {
        CashbackHacService cashbackHacService = new CashbackHacService();
        int amount = 0;
        int actual = cashbackHacService.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchBuyIfPurchase1000() {
        CashbackHacService cashbackHacService = new CashbackHacService();
        int amount = 1000;
        int actual = cashbackHacService.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchBuyIfPurchaseMore1000() {
        CashbackHacService cashbackHacService = new CashbackHacService();
        int amount = 1300;
        int actual = cashbackHacService.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }


}
