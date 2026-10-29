package main;

import java.util.Scanner;

public class Verzweigungen_case03 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	String vorname;
	String nachname;
	int alter;
	char geschlecht;
	
	System.out.print("Gib bitte deinen Vornamen ein: ");
	 vorname = scanner.next();
	 
	System.out.print("Gib bitte deinen Nachnamen ein: ");
	 nachname = scanner.next();
	 
	System.out.print("Gib bitte dein Alter ein: ");
	 alter = scanner.nextInt();
	 
	System.out.print("Gib bitte das Geschlecht ein (m, w, d): ");
	 geschlecht = scanner.next().charAt(0);
	 
	 
	 if(alter < 18 || geschlecht == 'd') {
	 
	 System.out.print("Hallo " + vorname);
	 
	} else if (geschlecht == 'w') {
		
		System.out.print("Hallo Frau "  + nachname);
		
	} else {
		
		System.out.print("Hallo Herr " + nachname);
	}
	 
	}
}
