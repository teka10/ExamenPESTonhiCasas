package banco.controllers;

import banco.model.entity.TarjetaCredito;

public interface BuscarPorNumeroController {
	public TarjetaCredito buscarTarjeta(String numero);
}
