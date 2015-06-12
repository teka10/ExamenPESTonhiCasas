package banco.controllers;

public interface PagoController {
	public void pagoTarjeta(String numero, String contrasenha, 
			String numeroComprobacion, int importe);
}
