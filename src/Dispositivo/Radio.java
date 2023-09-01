package Dispositivo;

import java.util.*;

public class Radio extends Dispositivo{
	private boolean Inter;
	private int volumen;
	private String cancion;
	
	public Radio() {
		super("Radio de la casa");
		this.Inter = false;
		this.volumen = 0;
	}
	
	public void InternetON() {
		this.Inter = true;
	}
	
	public void InternetOFF() {
		this.Inter = false;
	}
	
	public void VolumenUP() {
		if(volumen >= 100) {
			Util.report("");
		}
	}
	
	public void Cancion() {
		Random rand = new Random();
		int c = random()
		
	}

}

