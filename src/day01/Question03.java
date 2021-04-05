package day01;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir sayi giriniz");

        int sayi = scan.nextInt();

        if(sayi>99&&sayi<1000){
            int birler = sayi%10, onlar = (sayi/10)%10, yuzler = sayi/(100);

            System.out.println("Birler basamagi = "+birler+
                    "\nOnlar basamagi = "+onlar+
                    "\nYuzler basamagi = "+yuzler);
        }
        else {
            System.out.println("Uc basamkli sayi giriniz!!!");
        }


        scan.close();
    }
}
