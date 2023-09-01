package Dispositivo;

public class Router extends Dispositivo {

	private boolean inter;

	public Router() {
		super("Router");
		this.inter=false;
	}

	
	
    public String PruebaInter() {
 if(this.getElectricidad() == true) {

     if(this.getEncendido()== true) {
         return "Si hay internet";

     }else {
    	
         return "Hay electricidad pero el router no esta encendido";
     }

 }else {
	
     return "No le llega electricidad al router";

         }
    }

    	
  public void setInter() {
	  inter = !inter;
  }
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	