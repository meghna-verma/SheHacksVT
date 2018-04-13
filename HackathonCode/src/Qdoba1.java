import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


public class Qdoba1 /*implements ActionListener*/ {

	protected Shell shell;
	public static Text textHeight;
	public static Text textWeight;
	public static Text textAge;
	private String height;
	private String weight;
	private String age;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Qdoba1 window = new Qdoba1();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 800);
		shell.setText("Pick Your Perfect Qdoba");
		
		textHeight = new Text(shell, SWT.BORDER);
		textHeight.setBounds(30, 60, 76, 21);

		
		Label lblFirstTellUs = new Label(shell, SWT.NONE);
		lblFirstTellUs.setBounds(138, 10, 160, 15);
		lblFirstTellUs.setText("First, tell us about yourself:");
		
		textWeight = new Text(shell, SWT.BORDER);
		textWeight.setBounds(176, 60, 76, 21);
		
		textAge = new Text(shell, SWT.BORDER);
		textAge.setBounds(334, 60, 76, 21);
		
		Label lblHeight = new Label(shell, SWT.NONE);
		lblHeight.setBounds(45, 39, 55, 15);
		lblHeight.setText("Height");
		
		Label lblWeight = new Label(shell, SWT.NONE);
		lblWeight.setBounds(192, 39, 55, 15);
		lblWeight.setText("Weight");
		
		Label lblAge = new Label(shell, SWT.NONE);
		lblAge.setBounds(355, 39, 55, 15);
		lblAge.setText("Age");
		
		Button btnSubmit = new Button(shell, SWT.NONE);
		btnSubmit.setBounds(30, 87, 75, 25);
		btnSubmit.setText("Submit");
		
		QdobaAction QA = new QdobaAction();
		btnSubmit.addSelectionListener(QA);
		
		Button btnSubmit_1 = new Button(shell, SWT.NONE);
		btnSubmit_1.setBounds(176, 87, 75, 25);
		btnSubmit_1.setText("Submit");
		
		btnWeight bw = new btnWeight();
		btnSubmit_1.addSelectionListener(bw);
		
		
		Button btnSubmit_2 = new Button(shell, SWT.NONE);
		btnSubmit_2.setBounds(334, 87, 75, 25);
		btnSubmit_2.setText("Submit");
		
		btnAge ba = new btnAge();
		btnSubmit_2.addSelectionListener(ba);
		
		Label lblNowTellUs = new Label(shell, SWT.NONE);
		lblNowTellUs.setBounds(138, 194, 160, 15);
		lblNowTellUs.setText("Now, tell us what you want:");
		
		Button btnChicken = new Button(shell, SWT.CHECK);
		btnChicken.setBounds(7, 232, 93, 16);
		btnChicken.setText("Chicken");
		
		Button btnSteak = new Button(shell, SWT.CHECK);
		btnSteak.setBounds(106, 232, 93, 16);
		btnSteak.setText("Steak");
		
		Button btnPork = new Button(shell, SWT.CHECK);
		btnPork.setBounds(205, 232, 93, 16);
		btnPork.setText("Pork");
		
		Button btnFajitaVeggies = new Button(shell, SWT.CHECK);
		btnFajitaVeggies.setBounds(317, 232, 93, 16);
		btnFajitaVeggies.setText("Fajita Veggies");
		
		Button btnBrownRice = new Button(shell, SWT.CHECK);
		btnBrownRice.setBounds(7, 265, 93, 16);
		btnBrownRice.setText("Brown Rice");
		
		Button btnWhiteRice = new Button(shell, SWT.CHECK);
		btnWhiteRice.setBounds(106, 265, 93, 16);
		btnWhiteRice.setText("White Rice");
		
		Button btnBlackBeans = new Button(shell, SWT.CHECK);
		btnBlackBeans.setBounds(205, 265, 93, 16);
		btnBlackBeans.setText("Black Beans");
		
		Button btnPintoBeans = new Button(shell, SWT.CHECK);
		btnPintoBeans.setBounds(317, 265, 93, 16);
		btnPintoBeans.setText("Pinto Beans");
		
		Button btnAnchoBbq = new Button(shell, SWT.CHECK);
		btnAnchoBbq.setBounds(7, 300, 93, 16);
		btnAnchoBbq.setText("Ancho BBQ");
		
		Button btnBbCornSalsa = new Button(shell, SWT.CHECK);
		btnBbCornSalsa.setBounds(106, 300, 93, 16);
		btnBbCornSalsa.setText("BB Corn Salsa");
		
		Button btnPicoDeGallo = new Button(shell, SWT.CHECK);
		btnPicoDeGallo.setBounds(205, 300, 93, 16);
		btnPicoDeGallo.setText("Pico De Gallo");
		
		Button btnSalsaVerde = new Button(shell, SWT.CHECK);
		btnSalsaVerde.setBounds(317, 300, 93, 16);
		btnSalsaVerde.setText("Salsa Verde");
		
		Button btnSalsaRoja = new Button(shell, SWT.CHECK);
		btnSalsaRoja.setBounds(7, 336, 93, 16);
		btnSalsaRoja.setText("Salsa Roja");
		
		Button btnQueso = new Button(shell, SWT.CHECK);
		btnQueso.setBounds(106, 336, 93, 16);
		btnQueso.setText("Queso");
		
		Button btnSourCream = new Button(shell, SWT.CHECK);
		btnSourCream.setBounds(205, 336, 93, 16);
		btnSourCream.setText("Sour Cream");
		
		Button btnGuacamole = new Button(shell, SWT.CHECK);
		btnGuacamole.setBounds(317, 336, 93, 16);
		btnGuacamole.setText("Guacamole");
		
		Button btnLettuce = new Button(shell, SWT.CHECK);
		btnLettuce.setBounds(7, 370, 93, 16);
		btnLettuce.setText("Lettuce");
		
		Button btnCheeseShreds = new Button(shell, SWT.CHECK);
		btnCheeseShreds.setBounds(106, 370, 93, 16);
		btnCheeseShreds.setText("Cheese Shreds");
		
		Button btnTortillaStrips = new Button(shell, SWT.CHECK);
		btnTortillaStrips.setBounds(205, 370, 93, 16);
		btnTortillaStrips.setText("Tortilla Strips");
		
		Button btnFlourTortilla = new Button(shell, SWT.CHECK);
		btnFlourTortilla.setBounds(317, 370, 93, 16);
		btnFlourTortilla.setText("Flour Tortilla");
		
		Button btnCalcCalories = new Button(shell, SWT.NONE);
		btnCalcCalories.setBounds(155, 132, 122, 40);
		btnCalcCalories.setText("Calories You Need");
		
		QdobaAction3 QA3 = new QdobaAction3(shell);
		btnCalcCalories.addSelectionListener(QA3);
		
		
		
		
		Button btnCalcQCalories = new Button(shell, SWT.NONE);
		btnCalcQCalories.setBounds(138, 412, 160, 40);
		btnCalcQCalories.setText("Calories From Your Bowl");
		
		ArrayList<Button> checkList = new ArrayList<Button>();
		CalcQ cq = new CalcQ(checkList);
		btnCalcQCalories.addSelectionListener(cq);
		
		checkList.add(btnChicken);
		checkList.add(btnSteak);
		checkList.add(btnPork);
		checkList.add(btnFajitaVeggies);
		checkList.add(btnBrownRice);
		checkList.add(btnWhiteRice);
		checkList.add(btnBlackBeans);
		checkList.add(btnPintoBeans);
		checkList.add(btnAnchoBbq);
		checkList.add(btnBbCornSalsa);
		checkList.add(btnPicoDeGallo);
		checkList.add(btnSalsaVerde);
		checkList.add(btnSalsaRoja);
		checkList.add(btnQueso);
		checkList.add(btnSourCream);
		checkList.add(btnGuacamole);
		checkList.add(btnLettuce);
		checkList.add(btnCheeseShreds);
		checkList.add(btnTortillaStrips);
		checkList.add(btnFlourTortilla);
		
		Button btnCompare = new Button(shell, SWT.NONE);
		btnCompare.setBounds(127, 473, 184, 66);
		btnCompare.setText("Should I Get This Bowl?");
		
		CompareVals cv = new CompareVals(shell);
		btnCompare.addSelectionListener(cv);
		
		/*QdobaAction3 qa = new QdobaAction3(shell);
		btnCalcCalories.addSelectionListener(qa);*/
		
	}
	

	/*private ActionListener getButtonAction() {
        ActionListener action = new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                text.setText("Pressed %d times");
                System.out.println(e.getSource());
            }
        };
        return action;
    }*/
	/*btnSubmit.addActionListener(new ActionListener()
	{
	public void actionPerformed1(ActionEvent submit1) {
		btnSubmit.setText(String.format("Pressed %d times"));
		height = text.getText();
		text.setText("0");
	}
	})*/
	/**
	 * stores weight value from text field
	 */
	/*public void actionPerformed2(ActionEvent submit2) {
		weight = text_1.getText();
	}
	public void actionPerformed3(ActionEvent submit3) {
		age = text_2.getText();
	}*/
}
