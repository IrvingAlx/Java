package proyecto1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//import com.sun.javafx.tools.packager.Main;

/*
 * Clase principal, manda a llamar la grafica y la recuperacion y limpieza de datos
 * @author Emiliano 
 * @author Irving
 */

public class Principal {
	public ArrayList<String> list = new ArrayList<String>();
	public ArrayList <String> list2 = new ArrayList <String>();
	public ArrayList <Integer> cont = new ArrayList <Integer>();
	public int tamaño, i;
	
	/*
	 * Metodo principal manda a llamar grafico
	 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Grafico.launch();
	}
	
	/*
	 * ordena los datos recopilados del archivo csv
	 */
	public void Red (){
		this.list = ManejoDatos.regresaArrayList("/home/ic20elp/Downloads/tweets.csv");
		this.list2 = ManejoDatos.regresaArrayList("/home/ic20elp/POO/Practica1/Practica1/src/Proyecto/Prueba.txt");
		this.list = ManejoDatos.quitarcasos(this.list);
		this.cont = ManejoDatos.quitarPalabras(this.list, this.list2);
		
		for(String txt: this.list)
		System.out.println(txt);
		
		for(Integer num: cont){
			System.out.println(""+list2.get(this.i)+" : "+num);
			this.i++;
		}
	}
	
	/*
	 * recupera el valor de ArrayList list
	 * @return Regresa list
	 */
	public ArrayList<String> getList() {
		return list;
	}
	/*
	 * inserta el valor de ArrayList list
	 * @param list
	 */
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	/*
	 * recupera el valor de ArrayList list
	 * @return Regresa list2
	 */
	public ArrayList<String> getList2() {
		return list2;
	}
	/*
	 * inserta el valor de ArrayList list2
	 * @param list2
	 */
	public void setList2(ArrayList<String> list2) {
		this.list2 = list2;
	}
	/*
	 * recupera el valor de ArrayList cont
	 * @return Regresa cont
	 */
	public ArrayList<Integer> getCont() {
		return cont;
	}
	/*
	 * inserta el valor de cont
	 * @param cont
	 */
	public void setCont(ArrayList<Integer> cont) {
		this.cont = cont;
	}
	/*
	 * recupera el valor de tamaño
	 * @return Regresa tamaño
	 */
	public int getTamaño() {
		return tamaño;
	}
	/*
	 * inserta el valor de tamaño
	 * @param tamaño
	 */
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
}
