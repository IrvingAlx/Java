package Practica3;
/**
 * empleados con salfo fijo
 * @author jhons
 *
 */
public class empleadoFijo extends empleado {

	private double salarioFijo;
	private double sueldo;
	/**
	 * Crea empleados con saldo fijo
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param salarioFijo
	 */
	public empleadoFijo(String id, String nombre, String apellido, double salarioFijo) {
		super(id, nombre, apellido);
		this.salarioFijo = salarioFijo;
		// TODO Auto-generated constructor stub
	}
	/**
	 * calcula el salario del empleado
	 * @return sueldo 
	 */
    public double calcularSaldoFijo() {
    	sueldo = salarioFijo; 
    	return sueldo;
    }
}
