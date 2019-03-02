import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double tankattu = 0;
		int kilometrit = 0;
		double litrahinta = 0;
		
		System.out.print("Anna tankattu määrä: ");
		tankattu = input.nextDouble();
		System.out.print("Anna ajetut kilometrit: ");
		kilometrit = input.nextInt();
		System.out.print("Anna litrahinta: ");
		litrahinta = input.nextDouble();
		double kmhinta = litrahinta*(tankattu/kilometrit);
		System.out.println("Ajo per kilometri maksaa: " + kmhinta + ".");
		
		// TODO Auto-generated method stub

	}

}
