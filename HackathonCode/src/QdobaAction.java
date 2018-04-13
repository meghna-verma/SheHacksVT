import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;


public class QdobaAction implements SelectionListener{
	public String height;

	public void widgetDefaultSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public static SelectionListener widgetDefaultSelectedAdapter(Consumer c) {
		// TODO Auto-generated method stub
		return null;
	}

	public void widgetSelected(SelectionEvent arg0) {
		// TODO Auto-generated method stub
		height = Qdoba1.textHeight.getText();
		//Qdoba1.textHeight.setText("done!");
	}


	public static SelectionListener widgetSelectedAdapter(Consumer c) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}
