package day01;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

/*
	 * Ask user Name, Surname and credit card numbers than convert it to special
                * form
                *
	 * (Check credit card number, if there aren’t 16 digit print “Invalid credit
	 * card number”
	 *
	 * Input : John White 1234234534561478 Output : Name : J*** W**** CCN : ****
	 * **** **** 1478 (Initials for name and surname should be uppercase)
	 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isminizi girin");
		String name= scan.nextLine();
		String nameKalan = name.substring(1).replaceAll("\\w","*");

		System.out.println("lutfen soyisminizi girin");
		String surname= scan.nextLine();
		String surnameKalan = surname.substring(1).replaceAll("\\w","*");

		System.out.println("lutfen KART NUMARASINI girin");
		String card=scan.next();

		if (card.length()==16) {
			System.out.println(
					"NAME :"+ (name.toUpperCase().charAt(0))+
							nameKalan+" "+(surname.toUpperCase().charAt(0))+
							surnameKalan+"\nCCN: "+"**** **** **** "+card.substring(12,16)


			);
		} else {
			System.out.println("lutfen gecerli bir kart numarası giriniz!!");
		}





    }
}
