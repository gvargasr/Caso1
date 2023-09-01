package Dispositivo;

public class AireAcon extends Dispositivo {


	public AireAcon() {
		super("Aire acondicionado");
	}
	
	private int temp;
	
	
	public String SubirTemp(int cantidad) {
		if (this.getElectricidad() == true) {
			if (this.getEncendido()==true) {
				temp+=cantidad;
				return "La temperatura subio a "+temp;
			}else {
				return "Hay electricidad pero no esta encendido el Aire Acondidcionado";
			}
			
		}else {
			return "No tiene electricidad el Aire";
		}	
		
	}
	
	public String BajarTemp(int cantidad) {
		if (this.getElectricidad() == true) {
			if (this.getEncendido()== true) {
				temp-=cantidad;
				return "La temperatura bajo a "+temp;
			}else {
				return "Hay electricidad pero no esta encendido el Aire Acondidcionado";
			}
			
		}else {
			return "No tiene electricidad el Aire";
		}	
		
	}
	
	
	
	
	
}
