package CheeseShop;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Element;
import javax.swing.text.html.ListView;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;

public class index extends CheesrPage{
	public index() {
		// TODO Auto-generated constructor stub

		
/*		add(new ListView("cheeses",getCheeses()){
			@Override
			protected void populateItem(ListItem<T> item){
				Cheese cheese = (Cheese)item.getModelObject();
				item.add(new Label("name",cheese.getName()));
				item.add(new Label("description",cheese.getDescription()));
				item.add(new Label("price",cheese.getPrice()));
				item.add(new Link("add",item.getModel()){
					@Override
					public void onClick(){
						Cheese selected = (Cheese)getDefaultModelObject();
						getCart().getCheeses().add(selected);
					}
				});
			}
		});
*/		
	}
}
