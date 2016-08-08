package uebung01;

import java.util.Scanner;

public class BirthdayTest {
	
	public static void datum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie ein Datum ein");
		String s = sc.next();
		
		try{
			Birthday b = new Birthday(s);
			System.out.println(b.toString());
			datum();
		}
		catch(InvalidBirthdayException e){
			System.out.println(e.getMessage());
			datum();
		}
		sc.close();
	}

	public static void main(String[] args)
		throws InvalidBirthdayException{
		
		datum();
	}

}
