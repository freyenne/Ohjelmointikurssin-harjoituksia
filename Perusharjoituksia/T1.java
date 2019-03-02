import java.util.Scanner;
public class T1 {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		System.out.println("Hei, kerro minulle sananlasku. Voit lopettaa ohjelman"
				+ " kirjoittamalla LOPPU");
		String sananlasku = "";
		int lkm = 0;
		int pituus = 0;

		while (true) {
			
			System.out.print("Anna sananlasku: ");
			sananlasku = lukija.nextLine();
			pituus = pituus+sananlasku.length();
			lkm++;
			
			if (sananlasku.equals("LOPPU")) {
				break;
				
			} 
		} 
		System.out.println("Sananlaskuja oli: " + (lkm - 1) + " ja merkkejä oli: " +  (pituus-5));

		
		
	}
}
