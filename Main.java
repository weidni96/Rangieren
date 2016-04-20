package Aufgabe_16;

public class Main {
	public static void main(String[]args){
		Eingabe e = new Eingabe();
		boolean randomGame = e.randomGame();
		int[] numbers;
		Gleis g;
		
		if(!randomGame)numbers = e.numberInput();	
		else numbers = e.numberRandom();
		for(int i = 0; i < numbers.length; i++){
			System.out.println((i+1) + ": " + numbers[i]);
		}
		
		g = new Gleis(numbers, weiterSpielen);
		g.starten();
	}
}
