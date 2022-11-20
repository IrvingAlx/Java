package minCuadrado;

import java.lang.Math;

public class operaciones {

	double divisor;
	double dividiendo;
	double promY,promX;
	double b1v, b0v, ordenada;
	int n;
	
	
	public void promedio(double []valoresx, double[] valoresy) {
		int i = 0;
		n = valoresx.length;
		
		for(i=0; i < n; i++) {
			promY += valoresy[i]/n;
			promX += valoresx[i]/n;
		}
		
	}
	
	
	
	public double b1(double[] valoresx, double[] valoresy) {
		int i;
		//double salida = 0;
		
		for(i=0; i < n; i++) {
			dividiendo += ((valoresx[i]-promX)*(valoresy[i]-promY))  ;
			divisor   +=  Math.pow(valoresx[i]-promX,2);
		}
		
		b1v = dividiendo/divisor;
		
		return b1v;
	}
	
	public double b0() {
		//double salida; 
		
		b0v = promY - (promX*b1v);
		
		return b0v;
	}
	
	public void ordenada(double[] valoresx) {
		int i;
		
		for(i=0; i < n; i++) {
			ordenada = b0v + b1v*valoresx[i];
			System.out.println("Ordenada " + i + " es " + ordenada);
		}
	}
}
