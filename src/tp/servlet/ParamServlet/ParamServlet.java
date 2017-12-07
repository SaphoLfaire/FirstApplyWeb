package tp.servlet.ParamServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.servlet.GenericTPServlet;

@WebServlet("/servlet/ParamServlet")
public class ParamServlet extends GenericTPServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 934528069484087059L;
	
	protected void process (HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException{
		res.getOutputStream().print("Formulaire envoyé");
		
	}

}
