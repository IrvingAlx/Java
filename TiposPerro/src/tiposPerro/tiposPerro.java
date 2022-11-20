package tiposPerro;

public class tiposPerro {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pastorAleman dog1 = new pastorAleman("Grande","Largo","35kg");
		chihuahua dog2 = new chihuahua("Chico","Cortooo","10kg");
		
		dog1.saludar();
		dog1.truco();
		dog1.mostrarDatos();
		dog2.saludar();
		dog2.truco();
		dog2.mostrarDatos();
	}

}
