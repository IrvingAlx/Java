package biblioteca;

public class biblioteca {
	
	private String id, nombre;
	private estudiante[] estudiante = new estudiante[30];
	private profesor[] profesor = new profesor[30];
	private int numeroDeEstudiantes = 0;
	private int numeroDeProfesores = 0;

	public biblioteca(String id, String nombre) {
		// TODO Auto-generated constructor stub
        this.id = id;
        this.nombre = nombre;
	}
	
	public void agregarEstudiante(int id, String nombre, String apellido) {
		
		estudiante est = new estudiante(id,nombre,apellido);
		estudiante[numeroDeEstudiantes] = est;
		numeroDeEstudiantes++;
	
	}
	
	public void agregarProfesor(int id, String nombre, String apellido) {
		
		profesor prof = new profesor(id,nombre,apellido);
		profesor[numeroDeProfesores] = prof;
		numeroDeProfesores++;
	}

	public void prestamo(int id, int semana) {
		int i, validacion;
		if(id < 10) {
			for(i=0; i< numeroDeEstudiantes; i++) {
				
				if(estudiante[i].getId() == id) {
					validacion = estudiante[i].validarEstudiante(semana);
					if(validacion == 1) {
						estudiante[i].agregarLibrosPedidos(1);
					//	System.out.println("Se agrego con exito");
					}else if(validacion == 0){
						System.out.println("No se agrego prestamo a estudiante: " + estudiante[i].getNombre());
					}
					
				}
				validacion=0;
			}
		}else {
			for(i=0; i< numeroDeProfesores; i++) {
				
				if(profesor[i].getId() == id) {
					validacion = profesor[i].validarProfesores(semana);
					if(validacion == 1) {
						profesor[i].agregarLibrosPedidos(1);
					//	System.out.println("Se agrego con exito");
					}else if(validacion == 0){
						System.out.println("No se agrego prestamo a profesor: " + profesor[i].getNombre());
					}
				}
				validacion = 0;
			}
		}
		
	}
	
	
    public void imprimirEstudiantes() {
    	int i;
		for(i = 0; i < numeroDeEstudiantes; i++)
		{
			System.out.println("Estudiante " + i + " se llama " +estudiante[i].getNombre() +" Apellido: "+ estudiante[i].getApellido()+" Id: "+estudiante[i].getId()+" Libros: "+estudiante[i].getLibrosPedidos());
		}
    }
	
    public void imprimirProfesores() {
    	int i;
		for(i = 0; i < numeroDeProfesores; i++)
		{
			System.out.println("Profesor " + i + " se llama " +profesor[i].getNombre() +" Apellido: "+ profesor[i].getApellido()+" Id: "+profesor[i].getId()+" Libros: "+profesor[i].getLibrosPedidos());
		}
    }

}
