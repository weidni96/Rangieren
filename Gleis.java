/**
 * Beschreiben Sie hier die Klasse Gleis.
 * 
 * @author (Rainer Hofmann) 
 * @version (1)
 */
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
public class Gleis
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int Anzahl = 1;
    private ArrayList<Integer> waggonOrdnung = new ArrayList<Integer>();
    private ArrayList<Waggon> zuggleis = new ArrayList<Waggon>();
    private Stack<Waggon> abstellgleis = new Stack<Waggon>();
    private Stack<Waggon> rangiergleis = new Stack<Waggon>();
    private boolean zufallszug;
    private Eingabe eingabe = new Eingabe();
    private String ausgabe = new String();
    
    /**
     * Konstruktor für Objekte der Klasse Gleis
     */
    public Gleis(int[] waggon, boolean zufallszug){
        this.zufallszug = zufallszug;
        for(int i = waggon.length; i >= 1; i--){
            abstellgleis.push(new Waggon((waggon[i-1])));
            System.out.println(abstellgleis.peek().getNumber());
            waggonOrdnung.add(abstellgleis.peek().getNumber());
        }
        Collections.sort(waggonOrdnung);
        
    }
    public void starten(){
       while(true){
        System.out.println("Aktion\tWaggon\tvon\t\tnach\t\tZuggleis");
       
        while(!(abstellgleis.empty() && rangiergleis.empty())){
           
            if(abstellgleis.peek().getNumber() == waggonOrdnung.get(0)){
                abstellgleis_Zuggleis();
                rangiergleis_Abstellgleis();
            }else{
                abstellgleis_Rangiergleis();
            }
        
        }
        if(zufallszug == false){break;}
        zuruecksetzen();
        if(zufallszug == false){break;}
    }
   
}
     /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void abstellgleis_Rangiergleis(){  
        rangiergleis.push(abstellgleis.pop());
        System.out.println(Anzahl + "\t" + rangiergleis.peek().getNumber() + "\tAbstellgleis\tRangiergleis");
       
        this.Anzahl += 1;
        
    }
     /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void abstellgleis_Zuggleis(){
        ausgabe += "  " + abstellgleis.peek().getNumber();
        System.out.println(Anzahl + "\t" + abstellgleis.peek().getNumber() + "\tAbstellgleis\tZuggleis\t" + ausgabe);
        zuggleis.add(abstellgleis.pop());
        waggonOrdnung.remove(0);
        this.Anzahl += 1;
        
    }
     /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
   /** public void rangiergleis_Zuggleis(){
        System.out.println(Anzahl + "\t" + rangiergleis.peek().getNumber() + "\tRangiergleis\tZuggleis\t" );
        zuggleis.add(rangiergleis.pop());
        this.Anzahl += 1;
       
    }*/
    public void rangiergleis_Abstellgleis(){
        while(! rangiergleis.empty()){
        abstellgleis.push(rangiergleis.pop());
        System.out.println(Anzahl + "\t" + abstellgleis.peek().getNumber() + "\tRangiergleis\tAbstellgleis");
        this.Anzahl += 1;
    }
    }
    private void zuruecksetzen(){
     Anzahl = 1;
     waggonOrdnung = new ArrayList<Integer>();
     zuggleis = new ArrayList<Waggon>();
     abstellgleis = new Stack<Waggon>();
     rangiergleis = new Stack<Waggon>();
     eingabe = new Eingabe();
     ausgabe = new String();
     zufallszug = eingabe.weiterSpielen();
     if(zufallszug == true){
     int[] waggon = eingabe.numberRandom();
        for(int i = waggon.length; i >= 1; i--){
            abstellgleis.push(new Waggon((waggon[i-1])));
            System.out.println(abstellgleis.peek().getNumber());
            waggonOrdnung.add(abstellgleis.peek().getNumber());
        }
        Collections.sort(waggonOrdnung);
    }
   }
}
