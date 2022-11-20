package biblioteca;

public class estudiante {
	
	private String nombre, apellido;
	private int id;
	private int librosPedidos = 0;
	private int semana = 0;
	
	public estudiante(int id, String nombre, String apellido) {
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
	//	System.out.println("agregue libro");

	}
	
	public int validarEstudiante(int semana) {
		if(librosPedidos < 3 && semana <= 1) {
			//System.out.println("Validacion exitosa");
			return 1;
		}else {
			//System.out.println("Validacion Fallida");
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
