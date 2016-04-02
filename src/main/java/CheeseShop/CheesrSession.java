package CheeseShop;

import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;

public class CheesrSession extends WebSession{
	private Cart cart = new Cart();
	
	public CheesrSession(Request request) {
		super(request);
		// TODO Auto-generated constructor stub
	}
	
	public Cart getCart(){
		return cart;
	}

}
