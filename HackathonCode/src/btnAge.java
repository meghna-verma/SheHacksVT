import java.util.function.Consumer;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;


public class btnAge implements SelectionListener{

	public String age;
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
		age = Qdoba1.textAge.getText();
		//Qdoba1.textAge.setText("done!");
	}

	public static SelectionListener widgetSelectedAdapter(
			Consumer<SelectionEvent> c) {
		// TODO Auto-generated method stub
		return null;
	}

}
