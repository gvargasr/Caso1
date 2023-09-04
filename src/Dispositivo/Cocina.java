package Dispositivo;

public class Cocina extends Dispositivo{

	private boolean ingrediente = false;
	private Refrigerador refri;
	private boolean comida = false;//Si hay comida hecha


	public Cocina(Refrigerador ref) {
		super("Cocina");
		this.refri = ref;
	}
	
	public String PedirReceta() {
		if (refri.getCantidad()> 0) {
			refri.BajarC();
			ingrediente = true;
			return "Ingrediente Pedido. Listo para cocinar";
		}else {
			return "No hay suficientes ingredientes, rellene la refri";
		}
	 }
	
	public String cocinar(){
		if (this.getEncendido()== true) {
			if (ingrediente == true) {
				ingrediente = false;
				comida = true;
				return "Hay comida hecha";
			}else {
				return "No hay ingredientes suficientes para cocinar";
			}
		}else {
			return "La cocina no esta encendida";
		}
		
	}
	

	public String ServirComida() {
		if (comida == true) {
			comida = false;
			return "La comida fue servida ya no queda mas";
		}else {
			return "No hay comida hecha para servir";
		}
		
	}



}
