package practica_9;

public class operaciones {

	private double media;
	private double desE;
	double areaTotalA=0.0;
	double fdX=0.0;
	
	public operaciones(double media, double desviavionE) {
		// TODO Auto-generated constructor stub
		this.media=media;
		this.desE=desE;
	}
	
	public void calcularVFDN(double x){
		if(desE ==0) {
			throw new ArithmeticException("No se puede dividir entre 0");
		}else {
			this.fdX=(1/(this.desE*(Math.sqrt(2*Math.PI))))*Math.exp(-0.5*((Math.pow((x-this.media),2))/(Math.pow(this.desE, 2))));	

		}
	}

	public void calcularPFDN(double limInf, double limSup, double delta){
		double i;
		for(i=limInf; i<= limSup; i+=delta){
			this.calcularVFDN(i);
			this.areaTotalA += (this.fdX*delta);
		}
	}

}
