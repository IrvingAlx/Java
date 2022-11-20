package Practica3;
/**
 * empleados con pago por comision
 * @author jhons
 *
 */
public class empleadoComision extends empleado {

	private double porcentaje;
	private double salarioFijo;
	private double ventaTotal;
	private double sueldo;
	/**
	 * crea el empleado con saldo por comision
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param porcentaje
	 * @param salarioFijo
	 * @param ventaTotal
	 */
	public empleadoComision(String id, String nombre, String apellido, double porcentaje, double salarioFijo, double ventaTotal) {
		super(id, nombre, apellido);
		this.porcentaje = porcentaje;
		this.salarioFijo = salarioFijo;
		this.ventaTotal = ventaTotal;
		// TODO Auto-generated constructor stub
	}
	/**
	 * calcula el salaio por comision del empleado
	 * @return sueldo
	 */
    public double calcularSaldoComision() {
    	sueldo = (porcentaje*ventaTotal)+salarioFijo;
    	return sueldo;
    }
    /**
     * Recupera el valor de nombre
     * @return
     */
    public double getPorcentaje() {
    	return porcentaje;
    }
    
    /**
     * Recupera el valor de nombre
     * @return
     */
    public double getVentaTotal() {
    	return ventaTotal;
    }
    
    /**
     * Recupera el valor de nombre
     * @return
     */
    public double getSalarioFijo() {
    	return salarioFijo;
    }
}
