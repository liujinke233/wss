package publishServlet;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class WStest {

	public void hello(){
		System.out.println("helloworld!");
	}
	
	
	public static void main(String[] args) {
		String address="http://localhost:9090/ws";
		Endpoint.publish(address, new WStest());
		System.out.println("hehe");
	}
}
