package Practica3;


/**
 * Clase de empresa 
 * @author jhons
 *
 */
public class empresa {
	
	private String id, nombre, direccion;
	private empleado[] empleados = new empleado[30];
	private empleadoFijo[] empleadosFijo = new empleadoFijo[30];
	public empleadoComision[] empleadosComision = new empleadoComision[30];
	private int numeroEmpleados = 0;
	private int numeroEmpleadosFijo = 0;
	private int numeroEmpleadosComision = 0;
	
	/**
	 * constructor de empresas
	 * @param ide
	 * @param nombree
	 * @param direccione
	 */
	
	public empresa(String id, String nombre, String direccion){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
	
	/**
	 * agrega empreados de empresas
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param horasSueldo
	 * @param horasTrabajadas
	 */
	
	public void agregarEmpleado(String id, String nombre, String apellido, double horasSueldo, double horasTrabajadas) {
		
		empleado emp1 = new empleado(id,nombre,apellido);
		emp1.setHorasSueldo(horasSueldo);
		emp1.setHorasTrabajadas(horasTrabajadas);
		empleados[numeroEmpleados] = emp1;
		numeroEmpleados++;
	
	}

	/**
	 * agrega empreados de empresas
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param horasSueldo
	 * @param horasTrabajadas
	 */
	
	public void agregarEmpleadoComision(String id, String nombre, String apellido, double porcentaje, double salarioFijo, double ventaTotal) {
		
		empleadoComision emp2 = new empleadoComision(id,nombre,apellido,porcentaje,salarioFijo,ventaTotal);

		empleadosComision[numeroEmpleadosComision] = emp2;
		numeroEmpleadosComision++;
	
	}
	
	/**
	 * agrega empreados de empresas
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param horasSueldo
	 * @param horasTrabajadas
	 */
	
	public void agregarEmpleadoFijo(String id, String nombre, String apellido, double salarioFijo) {
		
		empleadoFijo emp3 = new empleadoFijo(id,nombre,apellido,salarioFijo);
		empleadosFijo[numeroEmpleadosFijo] = emp3;
		numeroEmpleadosFijo++;
	
	}
	
	/**
	 * calcula el salario total de la empresaS
	 * @return
	 */
	
	public double calcularNominaTotal(){
	
		double total = 0;
		int i;
		for(i = 0; i < numeroEmpleados; i++)
		{
			total += (empleados[i].calcularSalario());
		}
		for(i = 0; i < numeroEmpleadosFijo; i++)
		{
			total += (empleadosFijo[i].calcularSaldoFijo());
		}
		for(i = 0; i < numeroEmpleadosComision; i++)
		{
			total += (empleadosComision[i].calcularSaldoComision());
		}
		
		return total;
	}
	
    /**
     * Recupera el valor de nombre
     * @return
     */
    public int getnumeroEmpleados() {
    	return numeroEmpleados;
    }
    /**
     * Recupera el valor de nombre
     * @return
     */
    public int getnumeroEmpleadosFijo() {
    	return numeroEmpleadosFijo;
    }

    /**
     * Recupera el valor de nombre
     * @return
     */
    public int getnumeroEmpleadosComision() {
    	return numeroEmpleadosComision;
    }

    public void imprimirEmpleadosComision() {
    	int i;
		for(i = 0; i < numeroEmpleadosComision; i++)
		{
			System.out.println("Empleado " + i + " se llama " +empleadosComision[i].getNombre() +" Apellido: "+ empleadosComision[i].getApellido()+" Id: "+empleadosComision[i].getId()+" Porcentaje: "+empleadosComision[i].getPorcentaje()+" Salario Fijo: "+empleadosComision[i].getSalarioFijo()+" Venta total: "+empleadosComision[i].getVentaTotal ());
		}
    }
}
