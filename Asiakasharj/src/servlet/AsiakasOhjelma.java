package servlet;

import java.util.ArrayList;

import dao.Dao;
import model.Asiakas;
import model.Lukija;

public class AsiakasOhjelma {
	private Lukija lukija = new Lukija();
	private Dao dao = new Dao();
	
	public AsiakasOhjelma() {
		naytaValikko();
	}
	
	private void naytaValikko() {
		System.out.println("\n1. Lis�� asiakas");
		System.out.println("2. Muuta asiakasta");
		System.out.println("3. Poista asiakas");
		System.out.println("4. Listaa kaikki asiakkaat");
		System.out.println("0. Lopeta");
		switch (lukija.lueKokonaisluku("Valintasi: ")) {
		case 1:
			lisaaAsiakas();
			break;
		case 2:
			muutaAsiakas();
			break;
		case 3:
			poistaAsiakas();
			break;
		case 4:
			listaaKaikki();
			break;
		default:
			System.out.println("V��r� valinta!");
			break;
		}
		naytaValikko();
	}
	
	private void lisaaAsiakas() {
		Asiakas asiakas = new Asiakas();
		System.out.println("Uuden asiakkaan lis��minen");
		asiakas.setEtunimi(lukija.lueTeksti("Anna etunimi: "));
		asiakas.setSukunimi(lukija.lueTeksti("Anna sukunimi: "));
		asiakas.setPuhelin(lukija.lueTeksti("Anna puhelinnumero: "));
		asiakas.setSposti(lukija.lueTeksti("Anna s�hk�postiosoite: "));
		if(dao.lisaaAsiakas(asiakas)) {
			System.out.println("Asiakas lis�tty.");
		}else {
			System.out.println("Asiakkaan lis��minen ep�onnistui.");
		}
	}
	private void muutaAsiakas() {
		String etunimi;
		Asiakas asiakas = null;
		System.out.println("Asiakkaan tietojen muuttaminen");
		boolean asiakasLoytyi=false;
		do {
			
			etunimi = lukija.lueTeksti("Anna etunimi (-lopeta muutos)");
			asiakas = dao.loytyykoAsiakas(etunimi);
			if(etunimi.equals("-")) {
				return;
			}else if(asiakas!=null) {
				asiakasLoytyi=true;
			}else {
				System.out.println("Etunimell� ei l�ytynyt asiakkaita.");
			}
		} while(!asiakasLoytyi); {
			String etunimiUusi = lukija.lueTeksti("\n" + asiakas.getEtunimi() + 
					" / Anna uusi etunimi (tyhj� ohittaa) : ");
		  if(!etunimiUusi.equals("")) {
			asiakas.setEtunimi(etunimiUusi);
		}
		String sukunimiUusi = lukija.lueTeksti(asiakas.getSukunimi() +
				"/ Anna uusi sukunimi (tyhj� ohittaa) : ");
		if(!sukunimiUusi.equals("")) {
			asiakas.setSukunimi(sukunimiUusi);
		}
		String spostiUusi = lukija.lueTeksti(asiakas.getSposti() +
				"/ Anna uusi s�hk�postiosoite (tyhj� ohittaa) : ");
		if(!spostiUusi.equals("")) {
			asiakas.setSposti(spostiUusi);
		}
		String puhelinUusi =  lukija.lueTeksti(asiakas.getPuhelin() +
				"/ Anna uusi puhelinnumero (tyhj� ohittaa) : ");
		if(!puhelinUusi.equals("")) {
			asiakas.setPuhelin(puhelinUusi);
		}
		
		}
	}
	private void poistaAsiakas() {
		String etunimi;
		Asiakas asiakas = null; 
		System.out.println("Asiakkaan tietojen poistaminen");
		boolean asiakasLoytyi = false;
		do {
			etunimi = lukija.lueTeksti("Anna etunimi (-lopeta poisto): ");
			asiakas = dao.loytyykoAsiakas(etunimi);
			if(etunimi.equals("-")) {
				return;
			}else if(asiakas!=null) {
				asiakasLoytyi=true;
			}else {
				System.out.println("Etunimell� ei l�ytynyt asiakkaita.");
			}
		}while(!asiakasLoytyi);
			if(dao.poistaAsiakas(etunimi)) {
				System.out.println("Asiakkaan tiedot on poistettu.");
		}else {
			System.out.println("Asiakkaan tietojen poistaminen ep�onnistui.");
		}
	}
	private void listaaKaikki() {
		ArrayList<Asiakas> asiakkaat = dao.listaaKaikki();
		for(int i=0; i<asiakkaat.size(); i++) {
			System.out.println(asiakkaat.get(i).getEtunimi() + "\t");
			System.out.println(asiakkaat.get(i).getSukunimi() + "\t");
			System.out.println(asiakkaat.get(i).getSposti() + "\t");
			System.out.println(asiakkaat.get(i).getPuhelin() + "\t");
			System.out.println(asiakkaat.get(i).getAsiakas_id() + "\t\n");
		}
	}
	

	public static void main(String[] args) {
		new AsiakasOhjelma();
		// TODO Auto-generated method stub

	}

}
