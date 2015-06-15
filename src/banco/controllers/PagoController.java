package banco.controllers;

public interface PagoController {
	public String pagoTarjeta(String numero, String contrasenha, 
			String numeroComprobacion, int importe);
}
