import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class AutoOhjelma {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		Scanner inputLine = new Scanner(System.in);
		Date nyt = new Date();
		SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd");
		fdate = new SimpleDateFormat("yyyy");
		Auto auto = new Auto();
		System.out.println("Anna merkki: ");
		auto.setMerkki(inputLine.nextLine());
		System.out.println("Anna malli: ");
		auto.setMalli(inputLine.nextLine());
		System.out.println("Anna rekisterinumero: ");
		auto.setRekisterinumero(inputLine.nextLine());
		System.out.println("Anna vuosimalli: ");
		auto.setVuosimalli(inputLine.nextInt());
		
		
		System.out.println("Autosi merkki ja malli ovat " + auto.getMerkki() + " " + auto.getMalli());
		System.out.println("Autosi rekisterinumero on " + auto.getRekisterinumero());
		
		int ika = Integer.parseInt(fdate.format(nyt))-auto.getVuosimalli();
		
		System.out.println("Autosi ikä on " + ika + " vuotta");
		
		lukija.close();
        inputLine.close();
		
		// TODO Auto-generated method stub

	}

}
class Auto {
	private String malli, merkki, rekisterinumero;
	private int vuosimalli;
	
	public Auto() {
		super();
	} 
	
	public Auto(String malli, String rekisterinumero, String merkki, int vuosimalli) {
		super();
		this.malli = malli;
		this.rekisterinumero = rekisterinumero;
		this.vuosimalli = vuosimalli;
		this.merkki = merkki;
		
	}
	
	public String getMalli() {
		return malli;
	}
	public void setMalli(String malli) {
		this.malli = malli;
		
	}
	
	public String getRekisterinumero() {
		return rekisterinumero;
		
	}
	public void setRekisterinumero(String rekisterinumero) {
		this.rekisterinumero = rekisterinumero;
	}
	public String getMerkki() {
        return merkki;
    }
    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }    
    public int getVuosimalli() {
        return vuosimalli;
    }
    public void setVuosimalli(int vuosimalli) {
        this.vuosimalli = vuosimalli;
    }
    public String toString() {
        return "Auto [malli=" + malli + ", merkki=" + merkki
                + ", rekisterinumero=" + rekisterinumero + ", vuosimalli="
                + vuosimalli + "]";
    }
}