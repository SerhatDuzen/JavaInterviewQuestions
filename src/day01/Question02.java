package day01;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Y/N ikilisinden birisini giriniz");
        char c = scan.next().toLowerCase().charAt(0);
       switch (c){
           case 'y':
               System.out.println("YES");
               break;
           case'n':
               System.out.println("NO");
               break;
           default:
               System.out.println("Lutfen gecerli bir deger giriniz");
       }
        scan.close();

    }
}
