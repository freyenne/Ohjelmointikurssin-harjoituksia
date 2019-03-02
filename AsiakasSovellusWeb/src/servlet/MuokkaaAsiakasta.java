package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Asiakas;
import dao.Dao;

@WebServlet("/MuokkaaAsiakasta")
public class MuokkaaAsiakasta extends HttpServlet {
	private static final long serialVersionUID = 1L;       
   
    public MuokkaaAsiakasta() {
        super();
        System.out.println("MuutaAuto.MuutaAuto()");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MuokkaaAsiakasta.doGet()");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MuokkaaAsiakasta.doPost()");
		int asiakas_id = Integer.parseInt(request.getParameter("asiakas_id"));
		String etunimi = request.getParameter("etunimi");
		String etunimiUusi = request.getParameter("etunimiUusi");
		String sukunimi = request.getParameter("sukunimi");
		String puhelin = request.getParameter("puhelin");
		String sposti = request.getParameter("sposti");
		Asiakas asiakas = new Asiakas(asiakas_id, etunimiUusi, sukunimi, puhelin, sposti);
		Dao dao = new Dao();		
		dao.muokkaaAsiakasta(asiakas);
		response.sendRedirect("HaeAsiakkaat");		
	}
}
