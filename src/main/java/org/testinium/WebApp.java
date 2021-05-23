package org.testinium;

import java.util.Arrays;
import java.util.Scanner;



public class WebApp {
    public static void login ()
    {
        searchBox();
    }

    public static void searchBox()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir ürün adı giriniz:");
        String s = kb.nextLine();


        Computer computer = new Computer(s);
        System.out.println(Arrays.toString(computer.getComputerModuls()));
        System.out.println(Arrays.toString(computer.getComputerPrices()));

        computer.chooseRandomComputer();
        computer.chooseRandomComputer();
        computer.chooseRandomComputer();

        System.out.printf("%nSepetteki ürünler : %s", Arrays.toString(computer.getProductModel()));

        System.out.printf("%nToplam ödenecek tutar: %d", computer.getTotalPrice());

        computer.clearBasket();
    }

}
