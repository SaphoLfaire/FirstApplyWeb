package tp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/private/logout")
public class LogoutServlet extends GenericTPServlet {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -573556493680641003L;

	protected void process (HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException{
		req.getSession().invalidate();
		res.sendRedirect("../public/login.jsp");
	
	}

}
