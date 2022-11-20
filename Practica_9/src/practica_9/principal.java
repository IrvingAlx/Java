package practica_9;

import java.util.Scanner;
import java.text.DecimalFormat;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media, desE;
		
	//	DecimalFormat df =  new DecimalFormat("#");
		//df.setMaximumFractionDigits(5);
		
		try {
			Scanner Scan = new Scanner(System.in);

			System.out.println("Ingresa valor de la media: ");
				 media = Scan.nextDouble();

			System.out.println("Ingresa valor de la desviacion estandar: ");
				 desE = Scan.nextDouble();

			operaciones ejer =  new operaciones(media,desE);
			DecimalFormat dF = new DecimalFormat("#");
			dF.setMaximumFractionDigits(5);

			ejer.calcularVFDN(0.005);
			System.out.println("El valor de f(x):  "+ dF.format(ejer.fdX));
			ejer.calcularPFDN(1,10,0.003);
			System.out.println("El valor de la probabilidad es: "+ dF.format(ejer.areaTotalA));
		}catch(Exception e) {
			System.out.println("Ocurrio un error dfe tipo  "+ e.toString());
		}
		

	}

}
