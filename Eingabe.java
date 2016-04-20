package Aufgabe_16;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Eingabe {
	
	private Random random = new Random();
	
	public int[] numberInput(){
		System.out.println("Geben sie die Liste an Werten ein, die die Waggons haben sollen");
		System.out.println("Beispiel: \"10 12 14 44 123\"");
		while(true){
				Scanner input = new Scanner(System.in);
				String list = input.nextLine();
				String parts[] = list.split(" ");
				int[] numbers = new int[parts.length];
				boolean wrongInput = false;
				
				for(int i = 0; i < parts.length; i++){
					try{
						numbers[i] = Integer.parseInt(parts[i]);
					} catch(Exception e){
						System.out.println("Sie haben die Liste falsch eingegeben, bitte wiederholen...");
						wrongInput = true;
						break;
					}
					if(i == parts.length-1 && !wrongInput){
						return numbers;
					}
				}
		}
	}
	
	public int[] numberRandom(){
		int numbers = 0;
		System.out.println("Geben Sie die Menge an Waggons an...");
		while(true){
			try{
				Scanner input = new Scanner(System.in);
				numbers = input.nextInt();
				if(numbers < 1){
					System.out.println("Es muss mindestens einen Waggon geben...");
					continue;
				}
				break;
			} catch (InputMismatchException e){
				System.out.println("Bitte gib eine zahl ein!");
			}
		}
		int[] list = new int[numbers];
		for(int i = 0; i < numbers; i++){
			list[i] = random.nextInt(100);
		}
		return list;
	}
	
	public boolean weiterSpielen(){
		Scanner input = new Scanner(System.in);
		System.out.println("Wollen Sie nochmal Spielen?");
		System.out.println("Wenn ja, machen Sie eine Eingabe. Ansonsten druecken sie nur Enter...");
		String decide = input.nextLine();
		if(decide.equals("")){
			return true;
		}
		return false;
	}
	
	public boolean randomGame(){
		Scanner input = new Scanner(System.in);
		System.out.println("Wollen Sie die Liste selbst eingeben?");
		System.out.println("Wenn ja, machen Sie eine Eingabe. Ansonsten druecken sie nur Enter...");
		String decide = input.nextLine();
		if(decide.equals("")){
			return true;
		}
		return false;
	}
}
