package Dispositivo;


public class Refrigerador extends Dispositivo {
	
	
	private boolean Agua;
	private int Cantidad = 10;// Puede variar en si mi idea es que sea 10 y cada vez que se pide la receta se baje 1 al contador.
	
	public Refrigerador() {
		super("Refri");
	}
	
	public String Abastecer() {
		if(Cantidad<10) {
			Cantidad=10;
			return "Se ha llenado la refri";
		}else {
			return "La refri ya esta llena no es necesario abastecerla";
		}
	}
	
	public void BajarC(){
		if(Cantidad > 0) {
			Cantidad--;
		}
	}
	
	public int getCantidad() {
        return Cantidad;
    }

	public boolean isAgua() {
		return Agua;
	}

	public void setAgua(boolean agua) {
		Agua = agua;
	}
	
	
	
	
	
	
	
}
