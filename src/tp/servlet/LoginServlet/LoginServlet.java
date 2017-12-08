package tp.servlet.LoginServlet;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.data.UserBeans;
import tp.servlet.GenericTPServlet;

@WebServlet("/public/login")
public class LoginServlet extends GenericTPServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8022909715468714494L;

	protected void process (HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException{
		
		
		Map<String, String[]> matrice = req.getParameterMap();
				
		if ("pwd".equals(req.getParameter("pwd"))) {
			req.getSession().setAttribute("USER", new UserBeans(matrice.get("login")[0], new Date()));
			res.sendRedirect("../private/home.jsp");
		}
		else {
			req.getSession().setAttribute("ERROR", "Mot de passe faux");
			res.sendRedirect("../public/login.jsp");
		}
	}

}
