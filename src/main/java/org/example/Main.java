package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberToWords(123));
    }


    public static boolean isPalindrome(int sayi){

        if(sayi<0) sayi=sayi*-1;

        String stringSayi = Integer.toString(sayi);
        String sayininTersi = "";

        for(int i = 0;i<stringSayi.length();i++){
            sayininTersi = stringSayi.charAt(i) + sayininTersi;
        }

        return stringSayi.equals(sayininTersi);
    }

    public static boolean isPerfectNumber(int sayi){
        if(sayi<0) return false;

        int toplam = 0;
        boolean donus = false;

        for(int i = 1;i<sayi;i++){
            if((sayi%i)==0) toplam += i;
        }

        return sayi==toplam;
    }

    public static String numberToWords(int sayi){
        if(sayi<0)return "Invalid Value";
        String stringSayi = Integer.toString(sayi);
        String geciciIfade = "";
        String sonIfade = "";
        

        for(int i = 0; i<stringSayi.length();i++){

            switch (stringSayi.charAt(i)){
                case '0':
                    geciciIfade=  "Zero ";
                break;
                case '1':
                    geciciIfade=  "One ";
                    break;
                case '2':
                    geciciIfade=  "Two ";
                    break;
                case '3':
                    geciciIfade=  "Three ";
                    break;
                case '4':
                    geciciIfade=  "Four ";
                    break;
                case '5':
                    geciciIfade=  "Five ";
                    break;
                case '6':
                    geciciIfade=  "Six ";
                    break;
                case '7':
                    geciciIfade=  "Seven ";
                    break;
                case '8':
                    geciciIfade=  "Eight ";
                    break;
                case '9':
                    geciciIfade=  "Nine ";
                    break;
            }

            sonIfade += geciciIfade;
        }

        return sonIfade.strip();

    }
}



