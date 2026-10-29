package main;

import java.util.Scanner;


public class ConsoleApplications02 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Gib bitte eine ganze Zahl ein: ");
	int ersteZahl = scanner.nextInt();
	
	System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
	int zweiteZahl = scanner.nextInt();
	
	double ergebnis = ersteZahl * 100 / zweiteZahl;

	
	System.out.println("Ergebnis: " + ersteZahl + " von "+ zweiteZahl + " sind " + ergebnis + "%");

	
} }
