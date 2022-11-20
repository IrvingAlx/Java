package practica_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Clase para crear y validar ArrayList de datos
 */
public class Validar {

	public Validar() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Metodo que regresa un ArrayList
	 * Param: String con la direccion del archivo 
	 * Return: Regresa un ArrayList
	 */
	public static ArrayList<String> regresaArrayList(String ruta){
		ArrayList <String> list = new ArrayList <String>();
		try {
			Scanner csvData = new Scanner(new File("G:\\Mi unidad\\Ibero\\4.- Cuarto Semestre\\Pogramacion Orientada a Objetos\\Practica 12\\spam3.csv"));
			while(csvData.hasNext()) {
				list.add(csvData.nextLine());
				//System.out.println("hola");
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
		int tamaño,i;
		String buffer;
		ArrayList <String> listNoNumbers = new ArrayList <String>();

		tamaño = list.size();
		
		for(i=0; i< tamaño; i++) {
			

			buffer = (list.get(i).replaceAll("\\d", ""));
			buffer = (buffer.replaceAll("\\W", " "));
			listNoNumbers.add(buffer.replaceAll("mo[\\w]*", ""));
		

		}	

			
		
		return listNoNumbers;
	}

/*
 * Metodo que indica que tipo de FEEL tiene el twit
 * Param list ArrayList con los datos depurados 
 * Return list2 ArrayList con los datos clasificados 
 */
	
	public static ArrayList<String> sentimientosArray(ArrayList<String> list){

		int tamaño,i;
		String buffer;
		
		ArrayList <String> list2 = new ArrayList <String>();

		tamaño = list.size();
		
		for(i=0; i< tamaño; i++) {
					
			if(list.get(i).contains("I am")) {
				buffer = "FEEL1|";
				list2.add(buffer.concat(list.get(i)));
			}else if(list.get(i).contains("is not")) {
				buffer = "FEEL2|";
				list2.add(buffer.concat(list.get(i)));

			}else if(list.get(i).contains("to the")) {
				buffer = "FEEL3|";
				list2.add(buffer.concat(list.get(i)));
			}else {
				buffer = "NOTHING"
						+ "|";
				list2.add(buffer.concat(list.get(i)));
			}
				
		}
		
		return list2;
	}
/*
 * Metodo para limpiar palabras de un txt	
 * Param list ArrayListDepurado
 * Return list3 ArrayListDepurado
 */
	public static ArrayList<String> limpiarArrayPalabras(ArrayList<String> list){
		int tamaño, tamaño2,i,j;
		String buffer;

		ArrayList <String> list2 = new ArrayList <String>();
		ArrayList <String> list3 = new ArrayList <String>();

		list2 = Validar.regresaArrayList("G:\\Mi unidad\\Ibero\\4.- Cuarto Semestre\\Pogramacion Orientada a Objetos\\Practica 12\\palabras.txt");

		tamaño = list.size();
		tamaño2 = list2.size();
	
		for(i=0; i < tamaño; i++) {
			buffer = list.get(i);
			for(j=0; j < tamaño2; j++) {
				if(buffer.contains(list2.get(j))) {
					buffer = buffer.replaceAll(list2.get(j), "");
				}
			}			
			list3.add(buffer);
		}
	
		return list3;
	}
}

