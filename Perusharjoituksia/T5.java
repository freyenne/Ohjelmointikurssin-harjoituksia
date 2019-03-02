import java.util.Arrays;
import java.util.Scanner;
public class T5 {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		int [] lampotila = new int[100];
		int luku = 0;
		int kierrokset = 0;
		for (int i=0;i<lampotila.length;i++) {
			System.out.print("Anna lämpötila (-999 lopettaa): ");
			luku = lukija.nextInt();
			if (luku == -999) {
				
				break;
			} else {
				lampotila[i]=luku;
				kierrokset = kierrokset+1;
			}
			
			
		}
		Arrays.sort(lampotila, 0, kierrokset);
		System.out.println("Annoit lämpötilat: ");
		for(int i=0;i<kierrokset;i++) {
			System.out.println(" " + lampotila[i]);
		}
		
		
	}
}
