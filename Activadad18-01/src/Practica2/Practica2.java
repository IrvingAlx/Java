package Practica2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Registro de empleados y calculo de nomina 
 * @author Irving Alejandro Vega Lagunas 
 *
 */
public class Practica2 {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	
	 int numEmpleados;
	 String ids;
	 String nombre; 
	 int numHoras;
	 float saldoPorHora;
	 float total = 0;
	 float totalFinal = 0;
	 int i;
	 
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	 	System.out.println("Ingrese el numero de empleados");
			numEmpleados = Integer.valueOf(br.readLine()).intValue();
		
			for(i=0;i<numEmpleados;i++)
			{
				System.out.println("Ingrese su numero identificador");
					ids = br.readLine();
				System.out.println("Escriba nombre de empleado");
					nombre = br.readLine();
				System.out.println("Ingrese numero de horas trabajadas");
					numHoras = Integer.valueOf(br.readLine()).intValue();
				System.out.println("Ungrese sueldo por hora empleado");
					saldoPorHora = Integer.valueOf(br.readLine()).intValue();
				
				total = numHoras * saldoPorHora;
				
				System.out.println("El total a pagar es de " +nombre + "es de:" +total);
					totalFinal = totalFinal + total;
			}	
		System.out.println("El total a pagar es de todos los empleados es de:" +totalFinal);				
	}
}
