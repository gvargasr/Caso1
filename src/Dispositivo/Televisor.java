package Dispositivo;

import java.util.*;

public class Televisor extends Dispositivo{
	private boolean internet;
	private int volumen;
	private String canal;
	
	public Televisor(boolean inter) {
			super("Radio de la casa");
			this.internet = inter;
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
			Util.report("Reproduciendo cancion "+c);
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

		public String getCanal() {
			return "Reproduciendo canal "+canal;
		}

		public void setCanal(String canal) {
			this.canal = canal;
		}
}