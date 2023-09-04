package DeviceManager;
import Dispositivo.*;

public class DeviceManager implements DeviceManagerInterface {
	private boolean cortarLuz;
	private boolean cortarInternet;
	private boolean cortarAgua;
	private Radio radio1 = new Radio(true);
	private Televisor tele1 = new Televisor(true);
	private AireAcon aire1 = new AireAcon();
	private Refrigerador refri1 = new  Refrigerador();
	private CoffeeMaker coffee1 = new CoffeeMaker(refri1);
	private Lavadora lavadora1 = new Lavadora();
	private Router router1 = new Router();
	
	public DeviceManager() {
		this.setCortarLuz(false);
		this.setCortarInternet(false);
		this.setCortarAgua(false);
		
	}
		
		@Override
		public void CortarLuz() {
			radio1.cortarLuz();
			tele1.cortarLuz();
			aire1.cortarLuz();
			refri1.cortarLuz();
			coffee1.cortarLuz();
			lavadora1.cortarLuz();
			router1.cortarLuz();
			this.setCortarLuz(true);
			Util.report("Se corto la electricidad");
		}
		
		@Override
		public void CortarInternet() {
			radio1.setInternet(false);
			tele1.setInternet(false);
			router1.cortarInter();
			this.setCortarInternet(true);
			Util.report("Se corto el Internet");
		}
		
		@Override
		public void CortarAgua() {
			coffee1.setAgua(false);
			lavadora1.setAgua(false);
			refri1.setAgua(false);
			this.setCortarAgua(true);
			Util.report("Se corto el agua");
		}
		
		@Override
		public void QuitaAIngredientes() {
			refri1.BajarC();
			Util.report("Se redujeron los ingredientes");
		}
		
		@Override
		public void PonerElectricidad() {
			radio1.cortarLuz();
			tele1.cortarLuz();
			aire1.cortarLuz();
			refri1.cortarLuz();
			coffee1.cortarLuz();
			lavadora1.cortarLuz();
			router1.cortarLuz();
			this.setCortarLuz(false);
			Util.report("Se reestablecio la electricidad");
		}
		
		@Override
		public void PonerInternet() {
			radio1.setInternet(true);
			tele1.setInternet(true);
			router1.setInter();
			this.setCortarInternet(false);
			Util.report("Se reestablecio el Internet");
		}
		
		@Override
		public void PonerAgua() {
			coffee1.setAgua(true);
			lavadora1.setAgua(true);
			refri1.setAgua(true);
			this.setCortarAgua(false);
			Util.report("Se reestablecio el agua");
		}
		
		@Override
		public void AgregaIngredientes() {
			refri1.Abastecer();
			Util.report("Se abastecieron los ingredientes.");
		}

		@Override
		public boolean isCortarLuz() {
			return cortarLuz;
		}

		public void setCortarLuz(boolean cortarLuz) {
			this.cortarLuz = cortarLuz;
		}

		@Override
		public boolean isCortarInternet() {
			return cortarInternet;
		}

		public void setCortarInternet(boolean cortarInternet) {
			this.cortarInternet = cortarInternet;
		}

		@Override
		public boolean isCortarAgua() {
			return cortarAgua;
		}

		public void setCortarAgua(boolean cortarAgua) {
			this.cortarAgua = cortarAgua;
		}
}
