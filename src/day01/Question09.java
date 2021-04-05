package day01;

public class Question09 {

    public static void main(String[] args) {

        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        kontrolUcHarfli("baa");



    }

    public static void kontrolUcHarfli(String isim) {
        if(isim.length()==3){
            char ilkHarf = isim.charAt(0);
            char ikinciHarf = isim.charAt(1);
            char ucuncuHarf = isim.charAt(2);
            System.out.println(ilkHarf==ikinciHarf? ilkHarf==ucuncuHarf?
                    "uc harf de ayni":"sadece ilk ve ikinci harf ayni":
                    ikinciHarf==ucuncuHarf?"Ikinci ve ucuncu harf ayni":
                            ilkHarf==ucuncuHarf?
                                    "Ilk ve ucuncu harf ayni":
                                    "Uc harf de farkli!!! ");
        }else {
            System.out.println("3 harfli string girmeniz gerekiyor!!!!");
        }

    }


}
