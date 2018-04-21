package com.fpij.chpt4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalculateNavTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void computeStockWorth() {
        final CalculateNav calculateNav = new CalculateNav(ticker -> new BigDecimal("6.01"));
        BigDecimal expected = new BigDecimal("6010.00");
        System.out.println(calculateNav.computeStockWorth("ABC", 1000 ));

        assertEquals(0, calculateNav.computeStockWorth("ABC", 1000).compareTo(expected));

    }
}