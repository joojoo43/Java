package main;

import java.util.Scanner;

public class ConsoleApplications01 {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); 
		
	
	System.out.print("Gib bitte eine ganze Zahl ein: ");
		int ersteZahl = scanner.nextInt();
	System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
		int zweiteZahl = scanner.nextInt();
		
		
		int ergebnis = ersteZahl + zweiteZahl; 
		
	System.out.println("Das Ergebnis ist: "+ ersteZahl +  "+" + zweiteZahl + "=" + ergebnis);	
	
	
	
	
	
	
	
	
	
	
}


	
}
