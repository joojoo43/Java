package main;

import java.util.Random;
import java.util.Scanner;

public class Verzweigungen_case04 {
 public static void main(String[] args) {
	 
	 Scanner scanner = new Scanner(System.in);
	 Random random = new Random(); 
	 
	 int zahlSpieler1;
	 int zahlSpieler2;
	 int zufall; 
	 int distance1;
	 int distance2;
	 
	 
	 System.out.print("Spieler1, gib bitte Deinen Tipp ein: ");
	 zahlSpieler1 = scanner.nextInt();
	 System.out.print("Spieler2, gib bitte Deinen Tipp ein: ");
	 zahlSpieler2 = scanner.nextInt();
	 
	 
	 zufall = random.nextInt(1 , 101);
	  
	 distance1 = Math.abs(zufall - zahlSpieler1);
	 distance2 = Math.abs(zufall - zahlSpieler2);
	 
	 
	if ( distance1 > distance2) {
	 System.out.print("Zufallszahl: " + zufall + " Spieler 2 gewinnt.");
 } else if( distance2 > distance1){ 
	 System.out.print("Zufallszahl: " + zufall + " Spieler 1 gewinnt.");
 } else {
	 System.out.print("Zufallszahl: " + zufall + " Beide Spieler gewinnen.");
 }
 }
}
