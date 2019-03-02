package t4;

import java.util.HashMap;
import java.util.Scanner;

public class TyontekijaOhjelma {
	
	
	Scanner input = new Scanner(System.in);
	HashMap<String, Tyontekija> tyontekijat = new HashMap<String, Tyontekija>();
	
	
	public static void main(String[] args) {
		
		TyontekijaOhjelma tyontekijaohjelma = new TyontekijaOhjelma();
		tyontekijaohjelma.lisaaTyontekija();
	}
	
	private void lisaaTyontekija() {
		Tyontekija uusiTyontekija = new Tyontekija();
		System.out.println("Anna nimi: ");
		String nimi = input.nextLine();
		System.out.println("Anna osoite: ");
		String osoite = input.nextLine();
		System.out.println("Anna Tuntipalkka: ");
		double tuntipalkka = input.nextDouble();
		
		uusiTyontekija.setNimi(nimi);
		uusiTyontekija.setOsoite(osoite);
		uusiTyontekija.setTuntipalkka(tuntipalkka);
		
		tyontekijat.put(uusiTyontekija.getNimi(), uusiTyontekija);
		
		String listaus = "";
		Tyontekija lista = printTyontekijat(listaus);
		System.out.println(lista);
	}
	
	private Tyontekija printTyontekijat (String a) {
		return tyontekijat.get(a);
	}
	
	
	
}


