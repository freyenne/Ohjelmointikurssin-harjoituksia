
import java.util.Scanner;

public class Kulutus {
    private Scanner lukija = new Scanner(System.in);
    
    public Kulutus(){
    	
        int km = kysyKilometrit();        
        int litrat = kysyTankkaus();        
        double kulutus = laskeKulutus(km,litrat);
        naytaKulutus(kulutus);
    }
    
    private int kysyKilometrit(){
    	
        System.out.print("Anna ajetut kilometrit: ");
        return lukija.nextInt();
    }
    
    private int kysyTankkaus(){
    	
        System.out.print("Anna kulunut polttoainem‰‰r‰: ");
        return lukija.nextInt();
    }
    
    private double laskeKulutus(int kilometrit, int tankattu){
        return  (double)tankattu / kilometrit * 100;
    }
    
    private void naytaKulutus(double kulutus){
              
        System.out.println("Kulutus/100 on " + (kulutus) +" litraa");
    }
    
    public static void main(String[] args) {
        new Kulutus();
    }

}
