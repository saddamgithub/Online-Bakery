package CheeseShop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.wicket.Application;
import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;

public class CheesrApplication extends WebApplication{
	
	private List<Cheese> cheeses = Arrays.asList(
			new Cheese("Cheese A", "From variety A",1.10),
			new Cheese("Cheese B", "From variety B",2.10),
			new Cheese("Cheese C", "From variety C",3.10),
			new Cheese("Cheese D", "From variety D",4.10),
			new Cheese("Cheese E", "From variety E",5.10)
			);
	
	public CheesrApplication() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void init(){
		
	}
	
	public static CheesrApplication get(){
		return (CheesrApplication) Application.get();
		
	}
	
	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return index.class;
	}
	
	@Override
	public Session newSession(Request request, Response response){
		return new CheesrSession(request);
	}

	public List<Cheese> getCheeses() {
		return Collections.unmodifiableList(cheeses);
	}
	
	
	
}
