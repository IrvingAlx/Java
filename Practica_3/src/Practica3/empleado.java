package Practica3;

/**
 * Registro de empleados y calculo de nomina 
 * @author Irving Alejandro Vega Laguans
 *
 */

public class empleado {

	private String id, nombre, apellido;
	private double horasTrabajadas;
	private double horasSueldo;
	private double sueldo; 
	private double porcentaje;
	private double salarioFijo;
	private double ventaTotal;
	
	/**
	 * Es un constructor 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param horasTrabajadas
	 * @param horasSueldo
	 */
	
    public empleado(String id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    /**
     * Calcula el pago por empleado
     * @return pago por empelado 
     */
    
    public double calcularSalario() {
    	sueldo =  horasTrabajadas * horasSueldo;
    	return sueldo;
    }
        
    /**
     * Recupera el valor de horas sueldo
     * @return
     */
    public double getHorasSueldo() {
    	return horasSueldo;
    }

    /**
     * Recupera el valor de horas trabjadas
     * @return
     */
    public double getHorasTrabajadas() {
    	return horasTrabajadas;
    }
      
    /**
     * Recupera el valor de nombre
     * @return
     */
    public String getNombre() {
    	return nombre;
    }
    
    /**
     * Recupera el valor de nombre
     * @return
     */
    public String getApellido() {
    	return apellido;
    }
    
    /**
     * Recupera el valor de nombre
     * @return
     */
    public String getId() {
    	return id;
    }
    
  
    /**
     * Aigna el valor de sueldo 
     * @param horasSueldo
     */
    public void setHorasSueldo(double horasSueldo) {
    	if (horasSueldo <= 10) {
    		this.horasSueldo = horasSueldo;
    	}else {
    		this.horasSueldo = -1;
    	}
    	
    }
    
    
    /**
     * 
     * @param horasSueldo
     */
    public void setHorasTrabajadas(double horasTrabajadas) {
    	if (horasTrabajadas <= 1500) {
    		this.horasTrabajadas = horasTrabajadas;
    	}else {
    		this.horasTrabajadas = -1;
    	}
    	
    }
    
    
}


/**
 * 
 * @return
 
public void setPorcentaje(double porcentaje) {
	this.porcentaje = porcentaje;
}


 * 
 * @return

public void setSalarioFijo(double salarioFijo) {
	this.salarioFijo = salarioFijo;
}


 * 
 * @return

public void setVentaTotal(double ventaTotal) {
	this.ventaTotal = ventaTotal;
}
 
 **/