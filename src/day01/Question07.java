package day01;

import java.util.Scanner;

public class Question07

{
    public static void main(String[] args) {
         /*Soru 4:
        * Kullanicidan 8 primitive veri tipinde de deger alalim ve ekrana yazdiralim.
                * 1. Adim : Scanner class'i ile kullanicidan veri alalim
                * 2. Adim : Aldigimiz her bir veriyi degiskenlere atayalim
     * 3. Adim : Ekrana yazdiralim.
        INPUT      : 41
        OUTPUT  : Kullanicidan Aldigimiz sayi = 41

                */
        Scanner scan = new Scanner(System.in);

        System.out.println("Byte cinsinden bir sayi giriniz: ");
        byte b = scan.nextByte();
        System.out.println("Short cinsinden bir sayi giriniz: ");
        short s = scan.nextShort();
        System.out.println("Int cinsinden bir sayi giriniz: ");
        int i = scan.nextInt();
        System.out.println("Long cinsinden bir sayi giriniz: ");
        long l = scan.nextLong();
        System.out.println("Float cinsinden bir sayi giriniz: ");
        float f = scan.nextFloat();
        System.out.println("Double cinsinden bir sayi giriniz: ");
        double d = scan.nextDouble();
        System.out.println("Char cinsinden bir sayi giriniz: ");
        char c = scan.next().charAt(0);
        System.out.println("Boolean cinsinden bir sayi giriniz: ");
        boolean b1 = scan.nextBoolean();

        System.out.println("Byte deger = "+b +"\nShort deger = "+s+ "\nInteger deger = "+i +
                "\nLong deger = "+l+ "\nFloat deger = "+f+ "\nDouble deger = "+d+
                "\nChar deger = "+c+"\nBoolean deger = "+b);
    }

}
