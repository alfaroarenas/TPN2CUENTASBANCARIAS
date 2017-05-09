package ar.com.edu.unlam.cuentas;

public class CuentaCorriente extends Cuenta{

	public CuentaCorriente(Double dinero) {
		super(dinero);
	}

	private Double montoQueSeDebeAlBanco = null;
	private final Double MONTO_LIMITE_OFRECIDO = 2000.0;
	
	public void extraerDeCuentaCorriente(Double dineroExtraido){
		
		if(this.getDineroDisponible() > dineroExtraido){
			montoQueSeDebeAlBanco = this.getDineroDisponible() - dineroExtraido;
			this.setDineroDisponible(montoQueSeDebeAlBanco);
		}else if(this.getDineroDisponible() < dineroExtraido){
			//DESCUBIERTO
			montoQueSeDebeAlBanco = dineroExtraido - this.getDineroDisponible();
			if(montoQueSeDebeAlBanco > MONTO_LIMITE_OFRECIDO){
				Double montoConRecargo = ((5*montoQueSeDebeAlBanco)/100);
				this.setDineroDisponible(montoConRecargo+montoQueSeDebeAlBanco);
			}else{
				this.setDineroDisponible(montoQueSeDebeAlBanco);
				
			}
		}
	}
	
}
