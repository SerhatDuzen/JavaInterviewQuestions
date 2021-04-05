package day06;

import java.util.ArrayList;
import java.util.List;

public class q4 {

    public static void main(String[] args) {

        String str = "iloveyoujavatoo";
        String arr[] = str.split("" );
        String snc="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if((str.charAt(i)+"").equals(arr[j])&& !snc.contains(str.charAt(i)+"")){
                    snc+=str.charAt(i)+"";
                }
            }
        }
        System.out.println(snc);


    }
}
