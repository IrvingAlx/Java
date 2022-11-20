package guiProyecto3;

import javax.swing.SwingUtilities;

public class guiP1 {

	public static void main(String[] args) {
	
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EjemploGUI().create().show();
            }
        });
		
	}

}
