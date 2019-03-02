import java.util.Random;
import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int noppa = r.nextInt(6)+1;
		int tulos = 0;
		int laskuriyksi = 0;
		int laskurikaksi = 0;
		int heitto = (int) ((Math.random()*noppa) + 1);
		for(int i=0;i<10000;i++) {
			tulos = heitto;
		} if (tulos==6) {
			laskuriyksi = laskuriyksi + 1;
		} else if (tulos != 6) {
			laskurikaksi = laskurikaksi + 1;
		}
		input.close();
		if (laskuriyksi >= 1500 && laskuriyksi <= 1833) {
			System.out.println("Numero 6 tuli " + laskuriyksi + " kertaa. "
					+ "Satunnaislaskugeneraattori toimii oletetusti.");
		} else if (laskuriyksi < 1500 || laskuriyksi > 1833) {
			System.out.println("Numero 6 tuli " + laskuriyksi + " kertaa. "
					+ "Satunnaislaskugeneraattori ei toimi oletetusti.");
		}
		


	}
	

		
		

		// TODO Auto-generated method stub

	}


