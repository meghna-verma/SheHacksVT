import java.util.function.Consumer;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;


public class btnWeight implements SelectionListener{

	public String weight;
	
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
		weight = Qdoba1.textWeight.getText();
		//Qdoba1.textWeight.setText("done!");
		
		
		
	}

	public static SelectionListener widgetSelectedAdapter(
			Consumer<SelectionEvent> c) {
		// TODO Auto-generated method stub
		return null;
	}

}
