package Aufgabe_16;

public class Main {
	public static void main(String[]args){
		Eingabe e = new Eingabe();
		boolean weiterSpielen = e.weiterSpielen();
		int[] numbers;
		Gleis g;
		
		if(!weiterSpielen)numbers = e.numberInput();	
		else numbers = e.numberRandom();
		
		g = new Gleis(numbers, weiterSpielen);
		g.starten();
	}
}
