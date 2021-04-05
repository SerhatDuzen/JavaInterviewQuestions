package Day02;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        /*Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek
         * input  elma  2
         *        army  3
         *
         * output  eaea
         *         ayayay

         */
        ilksonharf();


    }

    private static void ilksonharf() {
        System.out.println("Lutfen bi kelime giriniz");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println("Ilk ve son harfleri kac kez yazdirmak istersin");
        int s3 = scan.nextInt();

        String yeni = "" + s.charAt(0) + s.charAt(s.length() - 1);

        for (int i = 0; i < s3; i++) System.out.print(yeni);

        scan.close();
    }
}
