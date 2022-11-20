package examen2;

import java.util.ArrayList;

public class PrincipalExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> newList = new ArrayList <String>();
		ArrayList <Integer> resultados = new ArrayList <Integer>();
		
		int tamano;
		
			System.out.println("ArrayList sin depurar");
			System.out.println("");		

			newList = DepurarArchivos.regresaArrayList("C:\\Users\\jhons\\Downloads\\DatosExamen2.csv");
				
				for(String txt : newList) {
					System.out.println(txt);
				}
			
			System.out.println("");		
			System.out.println("ArrayList depurador");
			System.out.println("");		
				
			newList = DepurarArchivos.depuraArraylist(newList);

				for(String txt : newList) {
					System.out.println(txt);
				}
			
			System.out.println("");		
							
			resultados = DepurarArchivos.manipula(newList.get(4), "PfizerBioNTech", "Covid19");
			
			tamano = resultados.size();
				
				for(int i=0; i< tamano; i++) {
					System.out.println(resultados.get(i));
				}
	
		
	}

}

