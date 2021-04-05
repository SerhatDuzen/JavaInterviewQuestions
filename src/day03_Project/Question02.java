package day03_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question02 {
    /*
 	Kullanicidan alinan degerleri ArrayList'e ceviren Java programini
 	yaziniz.
 */
    public static void main(String[] args) {
        List< Integer> list = new ArrayList<>();

        arrayaElemanEkle(list);



    }

    private static List<Integer> arrayaElemanEkle(List<Integer> list) {
        Scanner scan =  new Scanner(System.in);
        while (true){
            System.out.println("Cikmak isterseniz 0 a basiniz!!\nLutfen eklemek istediginiz sayiyi giriniz : ");
            int sayi = scan.nextInt();
            if(sayi!=0) list.add(sayi);
            else break;
        }
        System.out.println(list);
        return list;
    }
}
