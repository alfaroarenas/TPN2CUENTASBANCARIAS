package ar.com.edu.unlam.cuentas;

public class Cuenta {
	
	private Double dinero;
	
	public Cuenta(Double dinero){
		setDinero(dinero);	
	}
	
	public Double getDinero(){
		return dinero;
	}
	 
	public void setDinero(Double dinero){
		this.dinero=dinero;
	}
	
	public void extraer(Double extraerDinero){
		extraerDinero = dinero - extraerDinero;
		setDinero(extraerDinero);
	}
	
	public void depositar (Double depositarDinero){
		if(depositarDinero>0){
			this.dinero += depositarDinero;
		}
	}
}
