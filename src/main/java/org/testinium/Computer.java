package org.testinium;

import java.util.Random;


public class Computer extends Product {
    private String[] computerModuls = {"Lenova V14", "HP 250", "Monster Abra"};
    private int[] computerPrices = {1250, 1600, 3000};

    public Computer(String s) {
        super(s, 3);

    }
    public String[] getComputerModuls()
    {
        return computerModuls;
    }
    public int[] getComputerPrices()
    {
        return computerPrices;
    }

    public void chooseRandomComputer()
    {
        Random r = new Random();
        int idx = r.nextInt(2);
        addTobBasket(computerModuls[idx], computerPrices[idx]);

    }


}
