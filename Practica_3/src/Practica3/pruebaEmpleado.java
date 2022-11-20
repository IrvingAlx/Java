package Practica3;
/**
 * Clase  principal
 * @author jhons
 *
 */
public class pruebaEmpleado {
	
	/**
	 * Principal imprime los datos del usuario
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		empresa empresa1 = new empresa("entr1","Onix LLC","Av.Perro Cd Juarez");
		
		empresa1.agregarEmpleado("EMPN23","Juan Antonio","Perez",8,1000);
		empresa1.agregarEmpleado("EMPN24","Carlos Juan","Sanches",6,1000);
		
		empresa1.agregarEmpleadoFijo("EMPF25","Pancho Pedro","Lopez",8000);
		empresa1.agregarEmpleadoFijo("EMPF26","Luis Antonio","Villas",8000);
		
		empresa1.agregarEmpleadoComision("EMPC27","Carlos Emmanuel","Trejo",.5,1000,1000);
		empresa1.agregarEmpleadoComision("EMPC28","Juan Pablo","Velasquez",.5,1000, 1000);

		
		System.out.println("El salario de total es de " +empresa1.calcularNominaTotal());
		
		System.out.println("Existen " + empresa1.getnumeroEmpleados() + " empleados normales");
		System.out.println("Existen " + empresa1.getnumeroEmpleadosFijo() + " empleados por saldo Fijo");
		System.out.println("Existen " + empresa1.getnumeroEmpleadosComision() + " empleados por comision");
		
		empresa1.imprimirEmpleadosComision();
		
		//System.out.println("Empleado 0 se llama " +empresa1.empleadosComision[0].getNombre(),+empresa1.empleadosComision[0].getApellido());
		//System.out.println("Empleado 1 se llama " +empresa1.empleadosComision[1].getNombre());

	//	System.out.println("El salario de empleado Fijo es de " +emp2.calcularSaldoFijo());
	//	System.out.println("El salario de empleado comision es de " +emp1.calcularSaldoComision());
		
	}

}



