package day01;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen satin almak istediginiz urunun sayisini giriniz = ");

       int sayi = scan.nextInt();
        System.out.println("Urunun liste fiyatini giriniz = ");
        double fiyat = scan.nextDouble();
        System.out.println("Kredi kartiniz var mi? E/H");
        char c = scan.next().toLowerCase().charAt(0);

        if(c=='e'){
            if (sayi>10) {
                System.out.println("indirimli fiyat = "+ (fiyat*0.8));
            }else {
                System.out.println("indirimli fiyat = "+ (fiyat*0.85));
            }
        }else if (c=='h') {
            if (sayi>10) {
                System.out.println("indirimli fiyat = "+ (sayi*fiyat*0.85));
            }else {
                System.out.println("indirimli fiyat = "+ (sayi*fiyat*0.90));
            }
        }else {
            System.out.println("Lutfen gecerli deger giriniz");
        }



    }
}
