import java.util.Scanner;
public class Veriryhma {
	
	
	private Scanner lukija = new Scanner(System.in);
	private String [] veriRyhmat = {"AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-"};
	private int [] lukumaara = new int[veriRyhmat.length];
	
	public Veriryhma() {
		int luovutettu = kysyVeriryhma();
		System.out.println("Luovutuksia oli yhteens‰: " + luovutettu);
		System.out.println("Mink‰ veriryhm‰n luovutusten m‰‰r‰n haluat tiet‰‰: ");
		String sArvo = lukija.nextLine();
		sArvo= sArvo.toUpperCase();
		int maara = Veriryhma(sArvo);
		System.out.println("Veriryhm‰n " + sArvo + "luovutuksia oli " + lukumaara[maara]);
	}
	
	private int kysyVeriryhma() {
		boolean jatka = true;
		String sArvo = "";
		int luku = 0;
		do {
			System.out.println("Anna veriryhm‰ (- lopettaa): ");
			sArvo = lukija.nextLine();
			sArvo = sArvo.toUpperCase();
			if(sArvo.equals("-")) {
				break;
			} else if (sArvo.equals("AB+") || sArvo.equals("AB-")|| sArvo.equals("A+")
					|| sArvo.equals("A-")|| sArvo.equals("B+")|| sArvo.equals("B-")
					|| sArvo.equals("O+")|| sArvo.equals("O-")) {
				int maara = Veriryhma(sArvo);
				if (maara!=0) {
					lukumaara[maara]++;
					luku++;
				}
			}
		} while (jatka);
		return luku;
	}
	
	private int Veriryhma(String sArvo) {
		int palautus = 0;
		for (int i=0;i<veriRyhmat.length;i++) {
			if(veriRyhmat[i].equals(sArvo)) {
				palautus = i;
				break;
			}
		}
		return palautus;
	}

	public static void main(String[] args) {
		new Veriryhma();
		// TODO Auto-generated method stub

	}

}
