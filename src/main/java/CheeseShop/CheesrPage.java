package CheeseShop;

import java.util.List;

import org.apache.wicket.markup.html.WebPage;

public class CheesrPage extends WebPage{
	public CheesrSession getCheesrSession(){
		return (CheesrSession) getSession();
	}
	
	public Cart getCart(){
		return getCheesrSession().getCart();
	}
		
	public List<Cheese> getCheeses(){
		return CheesrApplication.get().getCheeses();
	}
	
}
