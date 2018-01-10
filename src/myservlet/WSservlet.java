package myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Endpoint;

import publishServlet.WStest;


public class WSservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    @Override
	public void init() throws ServletException {
    	
		super.init();
		System.out.println("init............");
    	String address="http://localhost:9090/ws";
		Endpoint.publish(address, new WStest());
		System.out.println("service已发布");
	}

	public WSservlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
