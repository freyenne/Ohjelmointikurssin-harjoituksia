import java.util.Scanner;
public class T4 {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		String [] rekno = new String[10];
		int max = 10;
		int lukumaara = 0;
		String numero = "";
		
		
		for (int i=0;i<max;i++) {
			System.out.print("Anna rekisterinumero (-lopettaa) : ");
			numero = lukija.nextLine();
			if (numero.equals("-")) {
				break;
			}
			
			numero = numero.toUpperCase();
			rekno [i] = numero;
			lukumaara++;
			
			if(lukumaara == max) {
				System.out.println("Ei enää rekisterinumeroita");
				break;
			}
		}
		System.out.println("Rekisterinumerot ovat: ");
		for (int i=0;i<lukumaara; i++) {
			System.out.println(rekno[i]);
		}
		
	}
}