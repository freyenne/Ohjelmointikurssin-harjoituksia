import java.util.Scanner;

public class KirjaKustantajaOhjelma {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
        
        System.out.print("Kirjan nimi: ");
        String kNimi = lukija.nextLine();
        System.out.print("Kirjan isbn: ");
        String isbn = lukija.nextLine();
        System.out.print("Kirjan hinta: ");
        double hinta = Double.parseDouble(lukija.nextLine());
        System.out.print("Kustantajan nimi: ");
        String kustNimi = lukija.nextLine();
        System.out.print("Kustantajan osoite: ");
        String osoite = lukija.nextLine();
        System.out.print("Kustantajan puhelin: ");
        String puhelin = lukija.nextLine();
		// TODO Auto-generated method stub
        
        Kirja kirja = new Kirja(kNimi, isbn, hinta, new Kustantaja(kustNimi, osoite, puhelin));
        
        System.out.println("Kirjan " +kirja.getNimi()+" kustantaja on " + kirja.getKustantaja().getNimi());
        lukija.close();
	}

}
