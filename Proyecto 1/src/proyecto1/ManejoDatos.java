package proyecto1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Clase manejo de datos, manda a llamar la grafica y la recuperacion y limpieza de datos
 * @author Emiliano 
 * @author Irving
 */
/*
 * 
 */
public class ManejoDatos {
	/*
	 * regresa los datos escaneados del csv en un archivo
	 * @param ruta 
	 * @return list 
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
	 * depura los datos del ArrayList
	 * @param list 
	 * @return list2
	 */
	public static ArrayList<String> quitarcasos(ArrayList<String> list){
		ArrayList <String> list2 = new ArrayList <String>();
		int tamanio;
		String aux;
		
		tamanio=list.size();
		
		for (int i = 0; i < tamanio; i++) {
			aux=(list.get(i).replaceAll("\\d",""));
			aux=(aux.replaceAll("\\W"," "));
			list2.add(aux);
		}
		return list2;
	}
	/*
	 * cuenta las coincidencias de palabras entre 2 archivos
	 * @param list2
	 * @return listnum
	 */
	public static ArrayList<Integer> quitarPalabras(ArrayList<String> list,ArrayList<String> list2){
		ArrayList <Integer> listnum = new ArrayList <Integer>();
		
		int tamanio,tamanio2=0,contador=0;
		tamanio2=list2.size();
		int[] contadores = new int[tamanio2];
		String aux;
		
		tamanio=list.size();
		
		for (int i = 0; i < tamanio; i++) {
			aux=list.get(i);
			
			for (int j = 0; j < tamanio2; j++) {
				if(list.get(i).contains(list2.get(j))==true){
					contadores[j]+=1;
				}
			}
		}
		
		for (int i = 0; i < tamanio2; i++) {
			listnum.add(contadores[i]);
		}
	
	return listnum;
	}
}
