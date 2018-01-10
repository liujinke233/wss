package myService;

import javax.jws.WebService;

@WebService
public class WSimp implements WS {

	@Override
	public void helloWorld() {
		System.out.println("hello world!");

	}

}
