package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isPalindrome(-707);
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(505));
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

    public static boolean isPerfectNumber(int a) {

        if(a<0) return false;

        int bölenToplamı=0;



        for(int i = 1; i <a;i++){
            if(a%i==0){
                bölenToplamı = bölenToplamı+i;
            }


        }
        return bölenToplamı==a;
    }

    public static String numberToWords(int a) {

        if(a<0) return "Invalid Value";

        String[] rakamlar = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String sayılar = String.valueOf(a);
        char[] sayıDizisi = sayılar.toCharArray();
        int sayı1 = 0;

        String sayıKelime = "";

        for (int i = 0; i<sayıDizisi.length;i++){

            sayı1 = sayıDizisi[i]-'0';

            for(int j=0;j<rakamlar.length;j++){

                if(j==sayı1) {
                    sayıKelime += rakamlar[j]+" ";
                }

            }
        }

        return sayıKelime.trim();

    }
}
