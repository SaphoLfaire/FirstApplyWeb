package tp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/HelloWorld")
public class HelloServlet extends GenericTPServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8685875680962488693L;
	
	protected void process (HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException{
		res.getOutputStream().print("Hello  !" + new java.util.Date());
		
	}
	

}
