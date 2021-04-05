package day01;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir sayi yaziniz = ");
        int sayi = scan.nextInt();
        String bir = "bir";
        String iki = "bir";
        String uc = "bir";
        String dort = "bir";
        String bes = "bir";
        String alti = "bir";
        String yedi = "bir";
        String sekiz = "bir";
        String dokuz = "bir";

if(sayi>99&&sayi<1000){
    int birler = sayi%10, onlar= (sayi/10)%10, yuzler = sayi/100;
    switch (yuzler){
        case 1:
            System.out.print("yuz");
            break;
        case 2:
            System.out.print("ikiyuz");
            break;
        case 3:
            System.out.print("ucyuz");
            break;
        case 4:
            System.out.print("dortyuz");
            break;
        case 5:
            System.out.print("besyuz");
            break;
        case 6:
            System.out.print("altiyuz");
            break;
        case 7:
            System.out.print("yediyuz");
            break;
        case 8:
            System.out.print("sekizyuz");
            break;
        case 9:
            System.out.print("dokuzyuz");
            break;
    }
    switch (onlar){
        case 0:
            System.out.print("");
            break;
        case 1:
            System.out.print("on");
            break;
        case 2:
            System.out.print("yirmi");
            break;
        case 3:
            System.out.print("otuz");
            break;
        case 4:
            System.out.print("kirk");
            break;
        case 5:
            System.out.print("elli");
            break;
        case 6:
            System.out.print("altmis");
            break;
        case 7:
            System.out.print("yetmis");
            break;
        case 8:
            System.out.print("seksen");
            break;
        case 9:
            System.out.print("doksan");
            break;
    }
    switch (birler){
        case 0:
            System.out.print("");
            break;
        case 1:
            System.out.print("bir");
            break;
        case 2:
            System.out.print("iki");
            break;
        case 3:
            System.out.print("uc");
            break;
        case 4:
            System.out.print("dort");
            break;
        case 5:
            System.out.print("bes");
            break;
        case 6:
            System.out.print("alti");
            break;
        case 7:
            System.out.print("yedi");
            break;
        case 8:
            System.out.print("sekiz");
            break;
        case 9:
            System.out.print("dokuz");
            break;
    }
}else {
    System.out.println("Lutfen uc basamakli bir sayi giriniz!!!");
}

    }
}
