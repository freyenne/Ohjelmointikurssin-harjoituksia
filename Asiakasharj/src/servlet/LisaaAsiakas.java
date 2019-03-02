package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import model.Asiakas;

@WebServlet("/LisaaAsiakas")
public class LisaaAsiakas extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LisaaAsiakas() {
        super();
        System.out.println("LisaaAsiakas.LisaaAsiakas()");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LisaaAsiakas.doGet()");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LisaaAsiakas.doPost()");
		String etunimi = request.getParameter("etunimi");
		String sukunimi = request.getParameter("sukunimi");
		String sposti = request.getParameter("sposti");
		String puhelin = request.getParameter("puhelin");
		int asiakas_id = Integer.parseInt(request.getParameter("asiakas_id"));
		Asiakas asiakas = new Asiakas(etunimi, sukunimi, sposti, puhelin, asiakas_id);
		Dao dao = new Dao();
		if(dao.lisaaAsiakas(asiakas)){
			response.sendRedirect("lisaaasiakas.jsp?ilmo=1");
		}else{
			response.sendRedirect("lisaaasiakas.jsp?ilmo=0");
		}
	}

}
