package tp.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class HttpUtil {
	
	private HttpUtil() {
		
	}
	
	public static void getParameters (HttpServletRequest req){
		
		System.out.println("Param");
		Map<String, String[]> matrice = req.getParameterMap();
		
		for (String key : matrice.keySet()) {
			System.out.println(key+ " : "+Arrays.toString(matrice.get(key)));
		}
	}

}
