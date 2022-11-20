package conectDB;

import Controlador.ControladorP;
import Modelo.ManipularBaseDatos;
import guiP1.EjemploGUI;

public class Principal {

	public static void main (String[] args) {
		
		ManipularBaseDatos prueba = new ManipularBaseDatos();
		EjemploGUI vistaP = new EjemploGUI();
		@SuppressWarnings("unused")
		ControladorP controlador = new ControladorP(vistaP, prueba);
		vistaP.setVisible(true);
				
	}		
}