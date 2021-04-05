package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q3 {

    public static void main(String[] args) {

        int arr[] = {2, 15, 67, 2, 56};

        try{
            arr[15]= 19;
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
