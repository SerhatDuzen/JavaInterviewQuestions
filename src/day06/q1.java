package day06;

public class q1 {

    public static void main(String[] args) {

        /*
Bir String parametre kabul eden bir method yazin, String builder kullanarak
o Stringi ters cevirin. Sonrasında girilen String palindrome mu degil mi kontrol eden
java kodunu yaziniz
Eg : input : I love Java
Output: "Reversed sentence : avaJ evol I .
   It is not a palindrome"
*/

        stringiTerseCevir("Serhat");
        stringPandromeMi("ata");

    }

    private static void stringPandromeMi(String word) {
        StringBuilder sb = new StringBuilder(word.toLowerCase());
        System.out.println(sb.equals(sb.reverse())?"Palindrome word":"Palindrome degil");
    }

    private static void stringiTerseCevir(String word) {
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse());
    }
}
