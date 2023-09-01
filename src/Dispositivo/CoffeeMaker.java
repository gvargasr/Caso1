package Dispositivo;

public class CoffeeMaker extends Dispositivo{
	
	private Refrigerador refri;
	public CoffeeMaker() {
		super("Cafetera");
		this.refri = refri;
	}
	
	private boolean Agua;
	private boolean ingrediente = false;
	private boolean Cafe = false;//Si hay cafe hecho
	
	
	public String PedirReceta() {
		if (refri.getCantidad()> 0) {
			refri.BajarC();
			ingrediente = true;
			return "Ingrediente Pedido. Listo para hacer cafe";
		}else {
			return "No hay suficientes ingredientes, rellene la refri";
		}
	 }
	
	public String HacerCafe(){
		if (this.getEncendido()== true) {
			if (ingrediente == true) {
				ingrediente = false;
				Cafe = true;
				return "Hay cafe hecho";
			}else {
				return "No hay ingredientes suficientes para hacer cafe";
			}
		}else {
			return "La cafetera no esta encendida";
		}
		
	}
	

	public String ServirCafe() {
		if (Cafe == true) {
			Cafe = false;
			return "El cafe fue servido ya no queda mas";
		}else {
			return "No hay cafe hecho para servir";
		}
		
	}

	public boolean isAgua() {
		return Agua;
	}

	public void setAgua(boolean agua) {
		Agua = agua;
	}
	
	
}
