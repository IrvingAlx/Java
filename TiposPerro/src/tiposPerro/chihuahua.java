package tiposPerro;

/**
 * 
 * @author jhons
 *
 */
public class chihuahua {
	public String tamaño;
	public String pelaje;
	public String peso;
	
	/**
	 * 
	 * @param tamaño
	 * @param pelaje
	 * @param peso
	 */
	public chihuahua(String tamaño, String pelaje, String peso) {
		// TODO Auto-generated constructor stub
		this.tamaño = tamaño;
		this.pelaje = pelaje;
		this.peso = peso;
	}
	
	/**
	 * 
	 */
	public void truco() {
		System.out.println("*da la patita*");
	}

	/**
	 * 
	 */
	public void saludar() {
		System.out.println("*wooof wooof*");
	}
	
	/**
	 * 
	 */
	public void mostrarDatos() {
		System.out.println("Tamaño "+ tamaño +" Pelaje "+ pelaje+ " Peso "+ peso);
	} 
}
