package ar.com.edu.unlam.cuentas;

public class CajaDeAhorros extends Cuenta{
	
	private Integer cantidadDeExtracciones;
	private final Double COSTO_ADICIONAL = 6.0;
	
	public CajaDeAhorros(Double dinero) {
		super(dinero);
	}
	
	public void extraccionDeCajaDeAhorros(Double montoAExtraer){
		this.cantidadDeExtracciones++;
		
		if(this.cantidadDeExtracciones > 5){
			this.extraer(montoAExtraer += this.COSTO_ADICIONAL);
		}
	}
	
	
	
}
