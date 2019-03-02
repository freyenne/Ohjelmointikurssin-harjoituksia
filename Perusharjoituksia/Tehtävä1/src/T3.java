import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kilometrit = 0;
		int summa = 0;
		double korvaus = 0;
		System.out.print("Anna ajetut kilometrit (0 lopettaa) : ");
		kilometrit = input.nextInt();
		while (kilometrit != 0) {
			summa = summa + kilometrit;
			System.out.print("Anna ajetut kilometrit (0 lopettaa) : ");
			kilometrit = input.nextInt();
		}
		korvaus = summa * 0.43;
		System.out.println("Yhteensä " + summa + " kilometriä");
		System.out.println("Korvaus on " + (1.0*korvaus) + " euroa");
		input.close();
		// TODO Auto-generated method stub

	}

}
