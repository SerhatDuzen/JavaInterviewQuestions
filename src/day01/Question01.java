package day01;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz ");

        int c = scan.next().charAt(0);
//int a = (int)c;
        System.out.println("Girmis oldugunuz karakterin ascii degeri =  " + c);

        //System.out.println(c+0);
        scan.close();
    }
}
