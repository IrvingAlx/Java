package examen2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Clase para crear y validar ArrayList de datos
 */
public class DepurarArchivos {

	/*
	 * Metodo que regresa un ArrayList
	 * Param: String con la direccion del archivo 
	 * Return: Regresa un ArrayList
	 */
	public static ArrayList<String> regresaArrayList(String ruta){
		ArrayList <String> list = new ArrayList <String>();
		try {
			Scanner csvData = new Scanner(new File(ruta));
			while(csvData.hasNext()) {
				list.add(csvData.nextLine());
			}
			
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		
		
		return list;
	}

	/*
	 * Metodo que depura los datos.
	 * Param: list un ArrayList de los twits
	 * Return: Regresa un ArrayList de datos depurados
	 */
	public static ArrayList<String> depuraArraylist(ArrayList<String> list){
		int tamano,i;
		String buffer;
		ArrayList <String> listNoNumbers = new ArrayList <String>();

		tamano = list.size();
		
		for(i=0; i< tamano; i++) {
			

			buffer = (list.get(i).replaceAll("\\W", ""));
			//buffer = (buffer.replaceAll("\\d", " "));
			listNoNumbers.add(buffer);
		

		}	

			
		
		return listNoNumbers;
	}
/*
 * Metodo que busca palabra
 * Param: Texto variable que contiene linea 
 * Param: Referencias  
 * Param: Parametro
 * Return: ArrayList manipula de tipo de entero
 */
	public static ArrayList<Integer> manipula(String texto, String Referencia, String Parametro){
	
		String buffer = null;
		String buffer2 = null;
		
		ArrayList <Integer> listNumbers = new ArrayList <Integer>();

		if(texto.contains(Referencia)) {
	
			buffer2 = texto.replaceAll(Referencia+"[\\w]*", "");

			System.out.println("" +buffer2);

			if(buffer2.contains(Parametro)) {
				buffer = texto.replaceAll("[\\w]*"+Parametro, "");
				listNumbers.add(1);
			}

		}
		
		System.out.println("" +buffer);

		
		return listNumbers;
	}
	

}

