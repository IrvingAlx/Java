package minCuadrado;

import java.lang.Math;

public class practica11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salida;
		
		operaciones op1 = new operaciones();
		double[]  valoresx = {30,28,32,25,25,25,22,24,35,40};
		double[]  valoresy = {25,30,27,40,42,40,50,45,30,25};
		
		op1.promedio(valoresx, valoresy);
		
		salida = op1.b1(valoresx, valoresy);
		
		System.out.println("Resultado de b1 es: "+ salida);
		
		salida = op1.b0();
		System.out.println("Resultado de b0 es: "+ salida);
		
		op1.ordenada(valoresx);
		

	}

}
