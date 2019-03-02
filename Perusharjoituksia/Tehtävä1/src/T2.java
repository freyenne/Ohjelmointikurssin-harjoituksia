import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vuositulo= 0;
		int ika = 0;
		double ylevero = 0;
		System.out.print("Anna vuositulosi: ");
		vuositulo = input.nextInt();
		System.out.print("Anna ikäsi: ");
		ika = input.nextInt();
		
		if (ika<18 || vuositulo < 7353) {
			ylevero = 0.00;
			System.out.println("Ylevero on " + ylevero);
		} else {
			ylevero = 0.0068*vuositulo;
			System.out.println("Ylevero on " + ylevero);
		}
	}
		// TODO Auto-generated method stub

}
