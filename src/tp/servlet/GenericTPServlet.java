package tp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.util.HttpUtil;

public abstract class GenericTPServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7626743250673350911L;

	@Override
	protected void doGet (HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException{
		process (req, res);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)  throws ServletException, IOException{
		
		process (req, res);
		HttpUtil.getParameters(req);
	}
	
	protected void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		

	}
}
