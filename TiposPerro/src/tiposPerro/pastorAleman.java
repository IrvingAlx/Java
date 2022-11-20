package tiposPerro;

/**
 * 
 * @author jhons
 *
 */
public class pastorAleman {
	public String tamaño;
	public String pelaje;
	public String peso;
	
	/**
	 * 
	 * @param tamaño
	 * @param pelaje
	 * @param peso
	 */
	public pastorAleman(String tamaño, String pelaje, String peso) {
		// TODO Auto-generated constructor stub
		this.tamaño = tamaño;
		this.pelaje = pelaje;
		this.peso = peso;
	}
	
	/**
	 * 
	 */
	public void truco() {
		System.out.println("*se hace el muerto*");
	}

	/**
	 * 
	 */
	public void saludar() {
		System.out.println("*wooof wooof wooof rrrrrrr*");
	}
	
	/**
	 * 
	 */
	public void mostrarDatos() {
		System.out.println("Tamaño "+ tamaño +" Pelaje "+ pelaje+ " Peso "+ peso);
	} 
}