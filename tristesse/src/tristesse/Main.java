package tristesse;

import java.util.Scanner;

public class Main {
	
	Scanner scanner  = new Scanner(System.in);
	String s;
	
	public Main()
	{
		System.out.println("Je ecrit: ");
		s = scanner.nextLine();
		Chiffrage chiffrage = new Chiffrage(s);
		
		System.out.println("Je recois: ");
		System.out.println(chiffrage.getStockage());
	}
	

}
