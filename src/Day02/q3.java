package Day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        /*
	    Girilen sayinin  Amstrong sayi olup olmadigini yazdiran java programi yaziniz
	    Ornek, 153 bir Armstrong sayidir. cunku 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Armstrong sayi bulma progami\nLutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        armstrongSayisiMi(sayi);
        scan.close();
    }

    private static void armstrongSayisiMi(int sayi) {
        int rakam = 0;
        int sum = 0;
        List<Integer> rakamlar = new ArrayList<Integer>();
        int ilkDeger = sayi;
        while (sayi != 0) { //153
            rakam = sayi % 10;
            rakamlar.add(rakam);
            sayi /= 10;
        }
        for (int i:rakamlar
             ) {
            sum += Math.pow(i, rakamlar.size());
        }
        if (sum == ilkDeger) System.out.println(sayi+ " Armstrong sayisi!!!!");
        else System.out.println(sayi+ " Armstrong sayisi degildir");
       // System.out.println(sum);

    }
}
