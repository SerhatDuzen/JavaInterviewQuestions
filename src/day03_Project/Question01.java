package day03_Project;

import java.util.ArrayList;

public class Question01 {

    /*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */

    public static void main(String[] args) {

        String[] arr = {"John","Brad","Ange","Sofia","Emily"};
        String[] arr2  = {"sofia","brad","grace","emily","hazel"};
        ortakElemanlariBul(arr,arr2);

    }

    private static void ortakElemanlariBul(String[] arr, String[] arr2) {
        for (String str1:arr
             ) {
            for (int i = 0; i < arr2.length ; i++) {
                if(str1.equalsIgnoreCase(arr2[i]))
                System.out.print(str1+" ");
            }
        }
    }
}
