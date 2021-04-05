package Day02;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        /*
        Bir Stringin tersten ayni olup olmadigini bulunuz.  (Palindrom)
		 *
		 * ornek
		 *  madam , nurses run  ==> palindromdur
		 *

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");

        String word = scan.next();

        polidromMu(word);


        scan.close();

    }

    private static void polidromMu(String word) {
        String reverse = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse+= word.charAt(i);
        }

        if(reverse.equalsIgnoreCase(word)) System.out.println(word+ " Polidom kelime");
        else System.out.println(word+ " Polidrom kelime degildir");
    }
}
