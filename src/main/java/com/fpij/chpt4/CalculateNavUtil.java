package com.fpij.chpt4;

import java.io.IOException;

public class CalculateNavUtil {
    public static void main(String[] args) throws Exception {
            final CalculateNav calculateNav = new CalculateNav(YahooFinance::getPrice);
            System.out.println("100 shares of GOOG are " + calculateNav.computeStockWorth("GOOG", 100));
        }

}
