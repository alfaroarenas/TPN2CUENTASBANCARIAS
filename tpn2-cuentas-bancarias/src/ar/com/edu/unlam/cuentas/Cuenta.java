package ar.com.edu.unlam.cuentas;

public class Cuenta {
	
	private Double dineroDisponible;
	
	public Cuenta(Double dinero){
		setDineroDisponible(dinero);	
	}
	
	public Double getDineroDisponible(){
		return dineroDisponible;
	}
	 
	public void setDineroDisponible(Double dinero){
		this.dineroDisponible=dinero;
		
	}
	
	public void extraer(Double extraerDinero){
		extraerDinero = dineroDisponible - extraerDinero;
		setDineroDisponible(extraerDinero);
	}
	
	public void depositar (Double depositarDinero){
		if(depositarDinero>0){
			this.dineroDisponible += depositarDinero;
		}
	}
}
