package Dispositivo;

public class Microondas extends Dispositivo{

	private boolean ingrediente = false;
	private Refrigerador refri;
	private boolean comida = false;//Si hay comida hecha


	public Microondas(Refrigerador ref) {
		super("Micro");
		this.refri = ref;
	}
	
	public String PedirReceta() {
		if (refri.getCantidad()> 0) {
			refri.BajarC();
			ingrediente = true;
			return "Ingrediente Pedido. Listo para calentar";
		}else {
			return "No hay suficientes ingredientes, rellene la refri";
		}
	 }
	
	public String calentar(){
		if (this.getEncendido()== true) {
			if (ingrediente == true) {
				ingrediente = false;
				comida = true;
				return "Hay comida caliente";
			}else {
				return "No hay ingredientes suficientes para calentar";
			}
		}else {
			return "El microondas no esta encendido";
		}
		
	}
	

	public String CalentarComida() {
		if (comida == true) {
			comida = false;
			return "La comida fue calentada, buen provecho!";
		}else {
			return "No hay comida para calentar";
		}
		
	}



}
