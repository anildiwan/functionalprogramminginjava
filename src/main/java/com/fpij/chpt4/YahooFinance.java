package com.fpij.chpt4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

public class YahooFinance {

    public static BigDecimal getPrice(final String symbol) {
        try {
            final URL url = new URL("https://api.iextrading.com/1.0/stock/" + symbol + "/price");

            final BufferedReader inputReader = new BufferedReader(new InputStreamReader(url.openStream()));

            final String data = inputReader.lines().findFirst().get().toString();

            final String[] dataItems = data.split(",");

            return new BigDecimal(dataItems[dataItems.length - 1]);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
