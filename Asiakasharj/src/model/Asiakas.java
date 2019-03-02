package model;

public class Asiakas {
	private String etunimi, sukunimi, sposti, puhelin;
	private int asiakas_id;
	public Asiakas() {
		super();
	}
	public Asiakas(String etunimi, String sukunimi, String sposti, String puhelin, int asiakas_id) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.sposti = sposti;
		this.puhelin = puhelin;
		this.asiakas_id = asiakas_id;
	}
	public String getEtunimi() {
		return etunimi;
	}
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	public String getSukunimi() {
		return sukunimi;
	}
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	public String getSposti() {
		return sposti;
	}
	public void setSposti(String sposti) {
		this.sposti = sposti;
	}
	public String getPuhelin() {
		return puhelin;
	}
	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}
	public int getAsiakas_id() {
		return asiakas_id;
	}
	public void setAsiakas_id(int asiakas_id) {
		this.asiakas_id = asiakas_id;
	}
	@Override
	public String toString() {
		return "Asiakas [etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", sposti=" + sposti + ", puhelin=" + puhelin
				+ ", asiakas_id=" + asiakas_id + "]";
	}
	

}
