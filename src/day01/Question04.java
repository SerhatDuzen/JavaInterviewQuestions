package day01;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Goruntulemek istediginiz ayin sayisini giriniz");

        int i = scan.nextInt();

        switch (i){

            case 1:
                System.out.println("OCAK");
                break;
            case 2:
                System.out.println("SUBAT");
                break;
            case 3:
                System.out.println("MART");
                break;
            case 4:
                System.out.println("NISAN");
                break;
            case 5:
                System.out.println("MAYIS");
                break;
            case 6:
                System.out.println("HAZIRAN");
                break;
            case 7:
                System.out.println("TEMMUZ");
                break;
            case 8:
                System.out.println("AGUSTOS");
                break;
            case 9:
                System.out.println("EYLUL");
                break;
            case 10:
                System.out.println("EKIM");
                break;
            case 11:
                System.out.println("KASIM");
                break;
            case 12:
                System.out.println("ARALIK");
                break;
            default:
                System.out.println("Gecersiz sayi girisi!!!");
        }
        scan.close();


    }
}
