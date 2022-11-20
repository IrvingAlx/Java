package biblioteca;

public class Escuela {

	public Escuela() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		biblioteca bib1 = new biblioteca("bib1","Lopez Florez");
				
		bib1.agregarEstudiante(1,"Juan","Perez");
		bib1.agregarEstudiante(2,"Lopez","Magon");
		bib1.agregarProfesor(10,"Pancho","Guzman");
		bib1.agregarProfesor(11,"Peter","Parker");
		
		bib1.prestamo(1,1);
		bib1.prestamo(1,1);
		bib1.prestamo(1,1);
		bib1.prestamo(1,1);
		bib1.prestamo(2,1);
		bib1.prestamo(10,1);
		bib1.prestamo(11,1);
		
		bib1.imprimirEstudiantes();
		bib1.imprimirProfesores();
//		bib1.prestamo(10,2);
//		bib1.prestamo(11,5);
		

	}

}
