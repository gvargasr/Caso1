package Dispositivo;

public class Lavadora extends Dispositivo {
	
	private boolean Agua;
	

	public Lavadora() {
		super("Lavadora");
	}
	
	public boolean isAgua() {
		return Agua;
	}

	public void setAgua(boolean agua) {
		Agua = agua;
	}
	
	public String Lavar(){
		if(this.getEncendido()== true) {
			if(Agua == true ) {
				return "La lavadora lavo";
			}else {
				return "La lavadora no tiene agua"; 
				}
		}else {
		return "La lavadora no esta encendida";
		}
	
	}
}
