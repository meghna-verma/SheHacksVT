import java.util.function.Consumer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;


public class QdobaAction3 implements SelectionListener{
	public static double cal;
	public static double calpermeal;
	
	Shell shell;
	public QdobaAction3 (Shell shell){
		this.shell = shell;
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
		String wt = Qdoba1.textWeight.getText();
		int weight = Integer.parseInt(wt);

		String ht = Qdoba1.textHeight.getText();
		int height = Integer.parseInt(ht);
		
		String ag = Qdoba1.textAge.getText();
		int age = Integer.parseInt(ag);
		
		cal = 1.375 * (655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age));
		calpermeal = cal / 3;
		
		Label cal1 = new Label(shell, SWT.NONE);
		cal1.setBounds(125, 180, 125, 100);
		//138, 412, 160, 40);
		//155, 132, 122, 40
		//cal1.setText("Your daily calorie count is" + cal);
		
		//System.out.println(calpermeal);
	}

	public static SelectionListener widgetSelectedAdapter(
			Consumer<SelectionEvent> c) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
