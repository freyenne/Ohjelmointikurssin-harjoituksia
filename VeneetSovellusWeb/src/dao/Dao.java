package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Vene;

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
	
	public boolean lisaaVene(Vene vene){
		boolean paluuArvo=true;
		sql="INSERT INTO Veneet(nimi, merkkimalli, pituus, leveys, hinta) VALUES(?,?,?,?,?)";						  
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql); 
			stmtPrep.setString(1, vene.getNimi());
			stmtPrep.setString(2, vene.getMerkkimalli());
			stmtPrep.setDouble(3, (double) vene.getPituus());
			stmtPrep.setDouble(4, (double) vene.getLeveys());
			stmtPrep.setDouble(5, (double) vene.getHinta());
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {				
			e.printStackTrace();
			paluuArvo=false;
		}				
		return paluuArvo;
	}
	
	public ArrayList<Vene> listaaKaikki(){
		ArrayList<Vene> veneet = new ArrayList<Vene>();
		sql = "SELECT * FROM Veneet";       
		try {
			con=yhdista();
			if(con!=null){ 
				stmtPrep = con.prepareStatement(sql);        		
        		rs = stmtPrep.executeQuery();   
				if(rs!=null){ 
					con.close();					
					while(rs.next()){
						Vene vene = new Vene();
						vene.setNimi(rs.getString(1));
						vene.setMerkkimalli(rs.getString(2));
						vene.setPituus(rs.getDouble(3));
						vene.setLeveys(rs.getDouble(4));	
						vene.setHinta(rs.getDouble(5));	
						veneet.add(vene);
					}					
				}				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return veneet;
	}
	
	public ArrayList<Vene> listaaKaikki(String hakusana){
		ArrayList<Vene> veneet = new ArrayList<Vene>();
		sql = "SELECT * FROM Veneet WHERE nimi LIKE ? or merkkimalli LIKE ?";       
		try {
			con=yhdista();
			if(con!=null){ 
				stmtPrep = con.prepareStatement(sql);  
				stmtPrep.setString(1, "%" + hakusana + "%");
				stmtPrep.setString(2, "%" + hakusana + "%");   
				   
        		rs = stmtPrep.executeQuery();   
				if(rs!=null){ 
					con.close();					
					while(rs.next()){
						Vene vene = new Vene();
						vene.setNimi(rs.getString(1));
						vene.setMerkkimalli(rs.getString(2));
						vene.setPituus(rs.getDouble(3));
						vene.setLeveys(rs.getDouble(4));	
						vene.setHinta(rs.getDouble(5));	
						veneet.add(vene);
					}					
				}				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return veneet;
	}
	
	public Vene loytyykoVene(String nimi){
		Vene vene = null;
		sql = "SELECT * FROM Veneet WHERE Nimi=?";       
		try {
			con=yhdista();
			if(con!=null){ 
				stmtPrep = con.prepareStatement(sql); 
				stmtPrep.setString(1, nimi);
        		rs = stmtPrep.executeQuery();  
        		if(rs.isBeforeFirst()){ 
        			vene = new Vene();        			
        			vene.setNimi(rs.getString(1));
					vene.setMerkkimalli(rs.getString(2));
					vene.setPituus(rs.getDouble(3));	
					vene.setLeveys(rs.getDouble(4));	 
					vene.setHinta(rs.getDouble(5));	
        			con.close();        			
				}			
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return vene;		
	}
	
	public boolean muutaVene(Vene vene){
		boolean paluuArvo=true;
		sql="UPDATE Veneet SET nimi=?, merkkimalli=?, pituus=?, leveys=?, hinta=? WHERE nimi=?";						  
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql); 
			stmtPrep.setString(1, vene.getNimi());
			stmtPrep.setString(2, vene.getMerkkimalli());
			stmtPrep.setDouble(3, vene.getPituus());
			stmtPrep.setDouble(4, vene.getLeveys());
			stmtPrep.setDouble(5, vene.getHinta());
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {				
			e.printStackTrace();
			paluuArvo=false;
		}				
		return paluuArvo;
	}
	
	public boolean poistaVene(String nimi){
		boolean paluuArvo=true;
		sql="DELETE FROM Veneet WHERE nimi=?";						  
		try {
			con = yhdista();
			stmtPrep=con.prepareStatement(sql); 
			stmtPrep.setString(1, nimi);			
			stmtPrep.executeUpdate();
	        con.close();
		} catch (SQLException e) {				
			e.printStackTrace();
			paluuArvo=false;
		}				
		return paluuArvo;
	}
	public String login(String uid, String pwd){
		String nimi=null;
		sql="SELECT Nimi FROM login WHERE uid=? AND pwd=?";						  
		try {
			con = yhdista();
			stmtPrep = con.prepareStatement(sql); 
			stmtPrep.setString(1, uid);
			stmtPrep.setString(2, pwd);
    		rs = stmtPrep.executeQuery();  
    		if(rs.isBeforeFirst()){ 
    			rs.next();
    			nimi=rs.getString("Nimi");
    			con.close();        			
			}		
		} catch (SQLException e) {				
			e.printStackTrace();			
		}				
		return nimi;
	}
}
