package guiP1;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class EjemploGUI extends JFrame{


	private static final long serialVersionUID = 1L;
	public EjemploGUI() {
		super ("Riesgo Cardiovascular");
		setSize(1080, 720);
		setLocation(400,180);
	//	setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
		// Layout por default es FlowLayout
	    Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\jhons\\Desktop\\health.png");  
	    setIconImage(icon);  

		setResizable (false);

		PanelUnoEx panl = new PanelUnoEx();
		


		this.add(panl);
	}


}