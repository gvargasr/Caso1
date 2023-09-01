package Dispositivo;

import java.util.*;

public class Radio extends Dispositivo{
	private boolean internet;
	private int volumen;
	private String cancion;
	
	public Radio() {
		super("Radio de la casa");
		this.internet = false;
		this.volumen = 0;
	}
	
	public void VolumenUp() {
		if(volumen >= 100) {
			Util.report("Volumen al maximo");
		}
		else {
			this.volumen = volumen + 5;
			Util.report("Se subio el volumen a"+volumen);
		}
	}
	
	public void VolumenDown() {
		if(volumen <= 0) {
			Util.report("Volumen al minimo");
		}
		else {
			this.volumen = volumen - 5;
			Util.report("Se subio el volumen a"+volumen);
		}
	}
	
	public void PonerCancion() {
		Random rand = new Random();
		int c = rand.nextInt(10) + 1;
		cancion = c+"";
		Util.report("Reproduciendo cancion "+cancion);
	}
	
	public void Spotify() {
		if(internet == true) {
			Util.report("Reproduciendo Spotify");
		}
		else {
			Util.report("No hay internet, no puede reproducir spotify");
		}
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public String getCancion() {
		return cancion;
	}

	public String setCancion(String cancion) {
		if(internet == true) {
			this.cancion = cancion;
			return "Reproduciendo "+cancion;
		}else {
			return "No hay internet";
		}
	}
}

