package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Asiakas;

public class Dao { 
	private Connection con=null;
	private ResultSet rs = null;
	private PreparedStatement stmtPrep=null; 
	private String sql;
	
	private Connection yhdista(){
    	Connection con = null;    	        	
    	String JDBCAjuri = "org.mariadb.jdbc.Driver";
    	String url = "jdbc:mariadb://localhost:15001/a1704715";        	
    	try {
	         Class.forName(JDBCAjuri);
	         con = DriverManager.getConnection(url,"a1704715", "miDEa576v");	        
	     }catch (Exception e){	         
	        e.printStackTrace();	         
	     }
	     return con;
	}
	
	public boolean lisaaAsiakas(Asiakas asiakas){
		boolean paluuArvo=true;
		sql="INSERT INTO asiakkaat VALUES(?,?,?,?)";						  
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql); 
			stmtPrep.setInt(2, asiakas.getAsiakas_id());
			stmtPrep.setString(2, asiakas.getEtunimi());
			stmtPrep.setString(3, asiakas.getSukunimi());
			stmtPrep.setString(4, asiakas.getSposti());
			stmtPrep.setString(5, asiakas.getPuhelin());
			
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {				
			e.printStackTrace();
			paluuArvo=false;
		}				
		return paluuArvo;
	}
	
	public ArrayList<Asiakas> listaaKaikki(){
		ArrayList<Asiakas> asiakkaat = new ArrayList<Asiakas>();
		sql = "SELECT * FROM asiakkaat";       
		try {
			con=yhdista();
			if(con!=null){ 
				stmtPrep = con.prepareStatement(sql);        		
        		rs = stmtPrep.executeQuery();   
				if(rs!=null){
					con.close();					
					while(rs.next()){
						Asiakas asiakas = new Asiakas();
						asiakas.setAsiakas_id(rs.getInt(1));
						asiakas.setEtunimi(rs.getString(2));
						asiakas.setSukunimi(rs.getString(3));
						asiakas.setSposti(rs.getString(4));	
						asiakas.setPuhelin(rs.getString(5));
						
						asiakkaat.add(asiakas);
					}					
				}				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return asiakkaat;
	}
	
	public ArrayList<Asiakas> listaaKaikki(String hakusana){
		ArrayList<Asiakas> asiakkaat = new ArrayList<Asiakas>();
		sql = "SELECT * FROM asiakkaat WHERE Etunimi LIKE ? or Sukunimi LIKE ? or Sposti LIKE ?";       
		try {
			con=yhdista();
			if(con!=null){
				stmtPrep = con.prepareStatement(sql);  
				stmtPrep.setString(1, "%" + hakusana + "%");
				stmtPrep.setString(2, "%" + hakusana + "%");   
				stmtPrep.setString(3, "%" + hakusana + "%");   
        		rs = stmtPrep.executeQuery();   
				if(rs!=null){ 
					con.close();					
					while(rs.next()){
						Asiakas asiakas = new Asiakas();
						asiakas.setAsiakas_id(rs.getInt(1));
						asiakas.setEtunimi(rs.getString(2));
						asiakas.setSukunimi(rs.getString(3));
						asiakas.setSposti(rs.getString(4));	
						asiakas.setPuhelin(rs.getString(5));	
						asiakkaat.add(asiakas);
					}					
				}				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return asiakkaat;
	}
	
	public Asiakas loytyykoAsiakas(String Etunimi){
		Asiakas asiakas = null;
		sql = "SELECT * FROM asiakkaat WHERE Etunimi=?";       
		try {
			con=yhdista();
			if(con!=null){ 
				stmtPrep = con.prepareStatement(sql); 
				stmtPrep.setString(1, Etunimi);
        		rs = stmtPrep.executeQuery();  
        		if(rs.isBeforeFirst()){ 
        			rs.next();
        			asiakas = new Asiakas();      
        			asiakas.setAsiakas_id(rs.getInt(1));
        			asiakas.setEtunimi(rs.getString(2));
					asiakas.setSukunimi(rs.getString(3));
					asiakas.setSposti(rs.getString(4));	
					asiakas.setPuhelin(rs.getString(5));        			
        			con.close();        			
				}			
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return asiakas;		
	}
	
	public boolean muutaAsiakas(Asiakas asiakas, String Etunimi){
		boolean paluuArvo=true;
		sql="UPDATE asiakkaat SET Etunimi=?, Sukunimi=?, Sposti=?, Puhelin=? WHERE Etunimi=?";						  
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql); 
			stmtPrep.setString(1, asiakas.getEtunimi());
			stmtPrep.setString(2, asiakas.getSukunimi());
			stmtPrep.setString(3, asiakas.getSposti());
			stmtPrep.setInt(4, asiakas.getAsiakas_id());
			stmtPrep.setString(5, Etunimi);
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {				
			e.printStackTrace();
			paluuArvo=false;
		}				
		return paluuArvo;
	}
	
	public boolean poistaAsiakas(String Etunimi){
		boolean paluuArvo=true;
		sql="DELETE FROM asiakkaat WHERE Etunimi=?";						  
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql); 
			stmtPrep.setString(1, Etunimi);			
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {				
			e.printStackTrace();
			paluuArvo=false;
		}				
		return paluuArvo;
	}
}
