import java.util.Scanner;
public class T2 {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna etunimi: ");
		String etunimi = lukija.nextLine();
		System.out.print("Anna sukunimi: ");
		String sukunimi = lukija.nextLine();
		System.out.print("Anna osoite: ");
		String osoite = lukija.nextLine();
		System.out.print("Anna postinumero: ");
		String postinumero = lukija.nextLine();
		System.out.print("Anna postitoimipaikka: ");
		String postitoimipaikka = lukija.nextLine();
		
		etunimi = etunimi.trim();
		sukunimi = sukunimi.trim();
		osoite = osoite.trim();
		postinumero = postinumero.trim();
		postitoimipaikka = postitoimipaikka.trim();
		
		String ekaKirjain = etunimi.substring(0,1).toUpperCase();
		String loppuNimi = etunimi.substring(1).toLowerCase();
		etunimi = ekaKirjain + loppuNimi;
		
		String ekaKirjainsuku = sukunimi.substring(0,1).toUpperCase();
		String loppuNimisuku = sukunimi.substring(1).toLowerCase();
		sukunimi = ekaKirjainsuku + loppuNimisuku;
		
		String ekaKirjainosoite = osoite.substring(0,1).toUpperCase();
		String loppuosoite = osoite.substring(1).toLowerCase();
		osoite = ekaKirjainosoite + loppuosoite;
		
		postitoimipaikka = postitoimipaikka.toUpperCase();
		
		System.out.println(etunimi + "\n" + sukunimi + "\n" + osoite + "\n" + 
				 postinumero + "\n" + postitoimipaikka);



		

	}

}
