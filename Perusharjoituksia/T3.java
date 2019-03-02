
import java.util.Scanner;
public class T3 {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		int tunnit[] = null;
	    int paivat = 0;
	    double tuntimaara = 0.0;
	    Double bruttopalkka = 0.0;
	    Double tuntipalkka = 0.0;
		System.out.print("Anna tuntipalkkasi: ");
        tuntipalkka = lukija.nextDouble();
        lukija.nextLine();
        System.out.print("Monenko p‰iv‰n tuntim‰‰r‰t annat: ");
        paivat = lukija.nextInt();
        lukija.nextLine();
        tunnit = new int[paivat];
		
		for (int i = 0;i<paivat;i++) {
			
			System.out.print("Anna tuntien m‰‰r‰ p‰iv‰ss‰: ");
			int kaikkitunnit = lukija.nextInt();
            tuntimaara = tuntimaara + kaikkitunnit;
            tunnit[i] = kaikkitunnit;
			
		}
		
		System.out.println("Tunteja yhteens‰: " + tuntimaara);
        bruttopalkka = tuntimaara * tuntipalkka;
        System.out.println("Bruttopalkkasi: " + (bruttopalkka*1.0));
        System.out.print("Annoit tunnit: ");
        
        for (int i=0;i<paivat;i++) {
            System.out.print(tunnit[i] + " ");
        }
	}
}