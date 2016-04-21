/**
 * Waggonsklasse
 * 
 * @author (Christian Staudte) 
 * @version (1)
 */
public class Waggon {
	private int nummer;
	
	/**
    	 * Konstruktor fuer einen Waggon
    	 * @param Integer mit der Waggonnummer
    	 */
	public Waggon(int nummer){
		this.nummer = nummer;
	}

	/**
    	 * get-Methode fuer die Waggonnummer
    	 * @return Integer Waggonnummer
    	 */
	public int getNumber(){
		return nummer;
	}
}
