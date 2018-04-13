import java.util.ArrayList;
import java.util.function.Consumer;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;


public class CalcQ implements SelectionListener{
	
	private ArrayList<Button> clist;
	public static int total;
	private int ing;
	
	public CalcQ(ArrayList<Button> clist) {
		this.clist = clist;
	}
 
	public void widgetDefaultSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}

	public static SelectionListener widgetDefaultSelectedAdapter(
			Consumer<SelectionEvent> c) {
		// TODO Auto-generated method stub
		return null;
	}

	public void widgetSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		
		ing = 0;
		total = 0;
		for(Button button : clist)
		{			
			//total = 0;
			if(button.getSelection() == true)
			{		
				if(button.getText().equals("Chicken"))
				{
					ing = 170;
				}
				if(button.getText().equals("Steak"))
				{
					ing = 180;
				}
				if(button.getText().equals("Pork"))
				{
					ing = 160;
				}
				if(button.getText().equals("Fajita Veggies"))
				{
					ing = 35;
				}
				if(button.getText().equals("Brown Rice"))
				{
					ing = 170;
				}
				if(button.getText().equals("White Rice"))
				{
					ing = 190;
				}
				if(button.getText().equals("Black Beans"))
				{
					ing = 140;
				}
				if(button.getText().equals("Pinto Beans"))
				{
					ing = 130;
				}
				if(button.getText().equals("Ancho BBQ"))
				{
					ing = 90;
				}
				if(button.getText().equals("BB Corn Salsa"))
				{
					ing = 110;
				}
				if(button.getText().equals("Pico De Gallo"))
				{
					ing = 10;
				}
				if(button.getText().equals("Salsa Verde"))
				{
					ing = 15;
				}
				if(button.getText().equals("Salsa Roja"))
				{
					ing = 20;
				}
				if(button.getText().equals("Queso"))
				{
					ing = 90;
				}
				if(button.getText().equals("Sour Cream"))
				{
					ing = 50;
				}
				if(button.getText().equals("Guacamole"))
				{
					ing = 130;
				}
				if(button.getText().equals("Lettuce"))
				{
					ing = 0;
				}
				if(button.getText().equals("Cheese Shreds"))
				{
					ing = 170;
				}
				if(button.getText().equals("Tortilla Strips"))
				{
					ing = 10;
				}
				if(button.getText().equals("Flour Tortilla"))
				{
					ing = 210;
				}
				total+=ing;
				
			}	
			
		}
		System.out.println(total);
	}

	public static SelectionListener widgetSelectedAdapter(
			Consumer<SelectionEvent> c) {
		// TODO Auto-generated method stub
		return null;
	}

}
