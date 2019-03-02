import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double saastotavoite = 0;
		int kk = 0;
		int saastosumma = 0;
		double kktavoite=0;
		System.out.print("Anna sääsötavoite: ");
		saastotavoite = input.nextDouble();
		System.out.print("Anna kuukausien lukumäärä: ");
		kk = input.nextInt();
		kktavoite=saastotavoite/(1.0*kk);
		
		for(int i=0;i<kk;i++) {
			saastosumma += kktavoite;
			System.out.println((i+1) + ". kuukausi " + kktavoite + "euroa, "
					+ "säästösumma " + saastosumma + " euroa." );
		}
		input.close();
		// TODO Auto-generated method stub

	}

}
