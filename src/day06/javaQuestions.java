package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class javaQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
//Swap islemini iki yoldan yaptiginiz java kodunu yaziniz.
		//1.Yol: 3. degisken kullanarak
		//2.Yol: 3. degisken kullanmadan
*/
        int value1 = 25;
        int value2 = 50;

        int value3 =value1;
        value1 = value2;
        value2 = value3;
        System.out.println("Yeni degerlerde\nvalue1 = "+value1+"\nvalue2 = "+value2);

       //ucuncu degisken kullanmadan
        if (value1>value2){
            for (int i = 0; i < value1; i++) {
                if(value1==i)value2=i;
            }
        }


 /*  Rastgele kullanıcı adı oluşturan JAVA kodu yazınız.
	 *  1. Adım : Kullanıcıdan ismini isteyelim
	 *  2. Adım : Kullanıcı adındaki boşlukları silelim.
	 *  3. Adım : Kullanıcı adının alınabilir olup olmadığına bakalım.
	 *  4. Adım : Eğer bizim listemizde öyle bir kullanıcı adı yoksa kullanıcı adı, kullanıcının girdiği isim olsun.
	 *  5. Adım : Eğer bu kullanıcı adı zaten varsa, sonuna rastgele sayı oluşturup ekleyelim, ve gösterelim.
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayşe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
	 */
        List<String> myDb = new ArrayList<>();
        myDb.add("Ahmet");
        myDb.add("Ayşe");
        myDb.add("Süleyman");
        myDb.add("Nazmi");
        System.out.print("Lutfen isminizi giriniz = ");
        String name = scan.nextLine().replaceAll(" ","");
        System.out.println(myDb.contains(name)?"Isim daha onceden alinmis lutfen baska bir " +
                "isim giriniz":"Girmis oldgunuz isim daha onceden alimamis" +
                "\nKaydiniz basari ile yapilmistir!!");
        /*
         * Verilen array’deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        int arr[] = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        List<Integer> lst = new ArrayList<>();
        for (int i:arr
             ) {
            if(!lst.contains(i)) lst.add(i);
        }
        System.out.println(lst);
    }
}
