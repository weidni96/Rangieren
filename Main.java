/**
 * Mainklasse
 * 
 * @author (Christian Staudte) 
 * @version (1)
 */
public class Main {
	public static void main(String[]args){
		Eingabe e = new Eingabe();
		boolean randomGame = e.randomGame();
		int[] numbers;
		Gleis g;
		
		if(!randomGame)numbers = e.numberInput();	
		else numbers = e.numberRandom();
		
		g = new Gleis(numbers, randomGame);
		g.starten();
	}
}
