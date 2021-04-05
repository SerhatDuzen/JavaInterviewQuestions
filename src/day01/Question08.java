package day01;

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
/*
	 Kullanicidan kilosunu ve boyunu alip
Vucut kitle indeksini hesaplayan bir program yaziniz.
Ipucu : Vucut
Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
ORNEK:
INPUT      : Kilo: 71
                  Boy: 1,72
OUTPUT  : Vucut Kitle Indeksiniz : 23
	 */

vikbul(85,195);

    }

    public static void vikbul(double kg,double boy){
        System.out.println("Vucut kitle indexi blma programi" +
                "\nLutfen vuct agirliginizi kg cinsinden yaziniz = ");
        Scanner scan = new Scanner(System.in);
        //double kg = scan.nextDouble();
        System.out.println("Lutfen boyunuzu cm cinsinden giriniz = ");
        //double boy = scan.nextDouble();
        double boym = boy/100;
        double index = kg/(boym*boym);
        System.out.println("Vucut kitle indexiniz = "+index);
    }


}
