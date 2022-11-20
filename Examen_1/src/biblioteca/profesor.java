package biblioteca;

public class profesor {
	
	private String nombre, apellido;
	private int id;
	private int librosPedidos = 0;
	private int semana = 0;

	public profesor(int id, String nombre, String apellido) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId(){
		return id;
	}
	
	public void agregarLibrosPedidos(int prestamo) {
		librosPedidos = librosPedidos + prestamo;
	}
	
	public int validarProfesores(int semana) {
		if(librosPedidos < 5 && semana <= 2) {
			return 1;
		}else {
			return 0;
		}
	
	}
	

	public String getNombre(){
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public int getLibrosPedidos(){
		return librosPedidos;
	
	}
	

}
