package t4;

import java.util.HashMap;
import java.util.Scanner;

public class HenkiloMapSovellus {
	Scanner input = new Scanner(System.in);
	HashMap<String, Henkilo> henkilot = new HashMap<String, Henkilo>();
	
	boolean exit;
	public static void main(String[] args) {
		
		
		HenkiloListaSovellus henkilolistasovellus = new HenkiloListaSovellus();
		henkilolistasovellus.runHenkiloListaSovellus();
	}
		public void runHenkiloListaSovellus() {
			
			
			while(!exit) {
				printHenkiloListaSovellus();
				int choice = getInput();
				teeValinta(choice);
			}
		}
		
		
		private void printHenkiloListaSovellus () {
			System.out.println("1. Lisää henkilö");
			System.out.println("2. Näytä henkilön tiedot");
			System.out.println("3. Muuta henkilön nimi ja osoite");
			System.out.println("4. Muuta henkilön koko");
			System.out.println("5. Näytä kaikki henkilöt");
			System.out.println("0. Lopetus");
			
		}
		private int getInput() {
			Scanner vastaus = new Scanner(System.in);
			int choice = -1;
			while(choice < 0 || choice > 5 ) {
				try {
					System.out.println("\nAnna valintasi (0-5): ");
					choice = Integer.parseInt(vastaus.nextLine());
				}
				catch(NumberFormatException e) {
					System.out.println("Väärä valinta. Kokeile uudelleen.");
				}
			}
			return choice;
		}
		
		private void teeValinta(int choice) {
			switch(choice) {
			case 0:
				exit = true;
				break;
			case 1:
				lisaaHenkilo();
				break;
			case 2:
				naytaHenkilo();
				break;
			case 3:
				muutaHenkilo();
				break;
			case 4:
				muutaKoko();
				break;
			case 5:
				naytaHenkilot();
				break;
			default:
				System.out.println("Valitse uudelleen");
				break;
			}
			
		}		
		
		private void lisaaHenkilo() {
			
			Henkilo uusiHenkilo = new Henkilo();
			System.out.println("Anna nimi: ");
			uusiHenkilo.setNimi(input.nextLine());
			System.out.println("Anna osoite: ");
			uusiHenkilo.setOsoite(input.nextLine());
			System.out.println("Anna pituus: ");
			uusiHenkilo.setPituus(input.nextLine());
			System.out.println("Anna paino: ");
			uusiHenkilo.setPaino(input.nextLine());
			henkilot.put(uusiHenkilo.getNimi(), uusiHenkilo);
			
		}
		private void naytaHenkilo() {
			System.out.println("Anna näytettävän henkilön nimi: ");
			String haku = input.nextLine();
			Henkilo haettava = henkilot.get(haku);
			
	        if(haettava == null){
	            System.out.println("Henkilöä ole");
	        }else{
	            System.out.println(haettava);
	        }     
	    }
			
		
		private void muutaHenkilo() {
			System.out.println("Anna perustietoja muutettavan henkilön nimi: ");
			String haku = input.nextLine();
			Henkilo haettava = etsiNimella(haku);
	        if(haettava == null){
	            System.out.println("Henkilöä ole");
	        }else{
	        	System.out.println("Anna nimi: ");
	    		String uusiNimi = input.nextLine();
	    		System.out.println("Anna osoite: ");
	    		String uusiOsoite = input.nextLine();
	            haettava.setNimi(uusiNimi);
	            haettava.setOsoite(uusiOsoite);
	        } 
		}
		private void muutaKoko() {
			
			System.out.println("Anna perustietoja muutettavan henkilön nimi: ");
			
			String haku = input.nextLine();
			Henkilo haettava = etsiNimella(haku);
	        if(haettava == null){
	            System.out.println("Henkilöä ole");
	        }else{
	        	System.out.println("Anna pituus: ");
	    		String uusiPituus = input.nextLine();
	    		System.out.println("Anna paino: ");
	    		String uusiPaino = input.nextLine();
	            haettava.setPituus(uusiPituus);
	            haettava.setPaino(uusiPaino);
	        } 
		}
		private void naytaHenkilot() {
			for(int i = 0; i<henkilot.size();i++){			
				System.out.println(henkilot.get(i));
			    
			}
		}
		private Henkilo etsiNimella (String teksti) {
			
			return henkilot.get(teksti);
		}
		
		// TODO Auto-generated method stub

	}


