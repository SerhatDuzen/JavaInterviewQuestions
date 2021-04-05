package day06;

public class q2 {

    public static void main(String[] args) {

// Q #1) replace() methodu kullanmadan bir String'deki bosluklari kaldiran Java kodunu yaziniz
String str = "Te  cc h pro Educati   on'in Full Sta ck Kurslari baslamisti           r";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' ')System.out.print(str.charAt(i));
        }
    }
}
