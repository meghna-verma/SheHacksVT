import java.util.function.Consumer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;


public class CompareVals implements SelectionListener{
	//private Label comp1;
	 Shell shell;
	public CompareVals (Shell shell){
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
		if(QdobaAction3.calpermeal < CalcQ.total)
		{
			int diff = (int) Math.ceil(CalcQ.total - QdobaAction3.calpermeal);
			
			/*Label lblWeight = new Label(shell, SWT.NONE);
			lblWeight.setBounds(192, 39, 55, 15);
			lblWeight.setText("Weight");
			*/
			Label comp1 = new Label(shell, SWT.NONE);
			comp1.setBounds(152, 600, 210, 70);
			comp1.setText("No! You are " + diff + " calories over!");
								
			//System.out.println("You are " + diff + " calories over!");
		}
		if(QdobaAction3.calpermeal > CalcQ.total)
		{
			int diffy = (int)Math.ceil((QdobaAction3.calpermeal - CalcQ.total));
			
			Label comp1 = new Label(shell, SWT.NONE);
			comp1.setBounds(152, 600, 210, 70);
			//127, 473, 184, 66 //192, 
			comp1.setText("No! You are " + diffy + " calories under!");
			
			//System.out.println("You are " + diffy + " calories under!");
		}
		if(QdobaAction3.calpermeal == CalcQ.total)
		{
			Label comp1 = new Label(shell, SWT.NONE);
			comp1.setBounds(152, 600, 210, 70);
			comp1.setText("Yes! Good job, order this!");
			//System.out.println("");
		}
	}

	public static SelectionListener widgetSelectedAdapter(
			Consumer<SelectionEvent> c) {
		// TODO Auto-generated method stub
		return null;
	}

}
