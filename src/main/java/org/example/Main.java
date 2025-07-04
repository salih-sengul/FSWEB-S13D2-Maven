package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isPalindrome(-707);
    }
    public static boolean isPalindrome(int a) {
        int sayi = a;
        if(sayi<0)sayi=sayi*-1;
        char[] karakterler = String.valueOf(sayi).toCharArray();
        System.out.println(Arrays.toString(karakterler));
        int karakterSayısı = karakterler.length;
        karakterSayısı--;
        System.out.println(karakterSayısı);
        boolean eşitMi = false;

        for (char c : karakterler) {

            eşitMi = c == karakterler[karakterSayısı];
            karakterSayısı--;
        }
        System.out.println(Arrays.toString(karakterler));
        System.out.println(eşitMi);
        return eşitMi;

    }

}
