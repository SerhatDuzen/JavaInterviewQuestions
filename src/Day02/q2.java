package Day02;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
/*
        girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
		 *
		 * input      output
		 * axyzm  ==   true
                * xyz    ==   true
                * x.yz   ==   false
                * xyaz   ==   false
*/
        Scanner scan =  new Scanner(System.in);
        System.out.println("Bir kelime giriniz = ");
        String word = scan.next().toLowerCase();

        xyzVarmi(word);
        scan.close();
    }

    private static boolean xyzVarmi(String str) {
        boolean flag = false;

        if(str.contains("xyz")) flag=true;

if(flag) System.out.println("Kelime xyz iceriyor");
else System.out.println("Kelime xyz icermiyor");

        return flag;
    }
}
