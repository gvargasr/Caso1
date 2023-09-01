package Dispositivo;
import java.util.*;

public class Dispositivo {
	private boolean encendido;
	private boolean electricidad;
	private int dano;
	private boolean sucio;
	private String nombre;
	
	public Dispositivo( String pnombre) {
		encendido = false;
		electricidad = false;
		dano = 0;
		sucio = false;
		nombre = pnombre;
		
		Util.report("Se inicializa el dispositivo"+nombre);
		
	}
	
	public boolean getEncendido(){
		return encendido;
	}
	
	public boolean getElectricidad(){
		return electricidad;
	}
	
	public int getDano(){
		return dano;
		
	}
	
	public boolean getSucio(){
		return sucio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void encender() {
		if(electricidad == true) {
			if(encendido==true) {
				Util.report("Dispositivo "+nombre+" actualmente encendido");
			}else {
				this.encendido = true;
				Util.report("Encendiendo dispositivo "+nombre);
			}
		}else {
			this.encendido = false;
		}
	}
	public void cortarLuz() {
		if(electricidad == true) {
			this.electricidad = false;
			this.encender();
		}else {
			this.electricidad = true;
		}
	}
	
	public void danar() {
		this.dano = true;
		Util.report("Dispositivo "+nombre+" danado");
	}
	
	public void reparar() {
		this.dano = false;
		Util.report("Dispositivo "+nombre+" reparado");
	}
	
	public void ensuciar() {
		this.sucio = true;
		Util.report("Dispositivo "+nombre+" sucio");
	}
	
	public void limpiar() {
		this.sucio = false;
		Util.report("Dispositivo "+nombre+" limpio");
	}

}
