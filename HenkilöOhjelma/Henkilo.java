package t4;

public class Henkilo {
	private String nimi, osoite;
	private String pituus, paino;
	public Henkilo() {
		
	}

	public Henkilo(String nimi, String osoite, String pituus, String paino) {
		super();
		this.nimi = nimi;
		this.osoite = osoite;
		this.pituus = pituus;
		this.paino = paino;
	}
	public Henkilo(String nimi) {
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}
	
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public String getPituus() {
		return pituus;
	}

	public void setPituus(String pituus) {
		this.pituus = pituus;
	}

	public String getPaino() {
		return paino;
	}

	public void setPaino(String paino) {
		this.paino = paino;
	}
	
	public double getPainoindeksi() { 
		double painoindeksi = Double.parseDouble(paino)/(Double.parseDouble(pituus))*
				(Double.parseDouble(pituus));
		return painoindeksi;
	}
	

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", pituus=" + pituus + ", paino=" + paino + "]";
	}

}
