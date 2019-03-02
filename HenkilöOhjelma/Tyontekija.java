package t4;

public class Tyontekija extends Henkilo {

	private double tuntipalkka ;

	public Tyontekija() {
		super();
	}

	

	public Tyontekija(String nimi, String osoite, double tuntipalkka) {
		super(nimi, osoite, null, null);
		this.tuntipalkka = tuntipalkka;
		// TODO Auto-generated constructor stub
	}

	public Tyontekija(double tuntipalkka) {
		super();
		this.tuntipalkka = tuntipalkka;
	}

	public double getTuntipalkka() {
		return tuntipalkka;
	}

	public void setTuntipalkka(double tuntipalkka) {
		this.tuntipalkka = tuntipalkka;
	}

	public Tyontekija(String nimi, String osoite, String pituus, String paino) {
		super(nimi, osoite, pituus, paino);
		// TODO Auto-generated constructor stub
	}

	public Tyontekija(String nimi) {
		super(nimi);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getNimi() {
		// TODO Auto-generated method stub
		return super.getNimi();
	}

	@Override
	public void setNimi(String nimi) {
		// TODO Auto-generated method stub
		super.setNimi(nimi);
	}

	@Override
	public String getOsoite() {
		// TODO Auto-generated method stub
		return super.getOsoite();
	}

	@Override
	public void setOsoite(String osoite) {
		// TODO Auto-generated method stub
		super.setOsoite(osoite);
	}



	@Override
	public String toString() {
		return "Tyontekija [tuntipalkka=" + tuntipalkka + "]";
	}

	
	

	
	
	

}
