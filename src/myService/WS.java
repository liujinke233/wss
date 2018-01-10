package myService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WS {

	@WebMethod
	public void helloWorld();
}
