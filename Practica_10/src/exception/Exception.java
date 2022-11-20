package exception;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EjemploTryCat objeto1 = new EjemploTryCat(4,9);
		objeto1.realizarDivision2();
		System.out.println("-----------");
		
		//try {
			//objeto1.realizarDivision();
		//}catch (Exception e1) {
			System.out.println("Denominador = 0");
			//System.out.println("Tipo: " + e1.toString() );
		//}finally {
			System.out.println("Codigo que siempre se ejecutara");
		//}
		

	}

}
