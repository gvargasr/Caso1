package DeviceManager;

public interface DeviceManagerInterface {

	void CortarLuz();

	void CortarInternet();

	void CortarAgua();

	void QuitaAIngredientes();

	void PonerElectricidad();

	void PonerInternet();

	void PonerAgua();

	void AgregaIngredientes();

	boolean isCortarLuz();

	boolean isCortarInternet();

	boolean isCortarAgua();

}
