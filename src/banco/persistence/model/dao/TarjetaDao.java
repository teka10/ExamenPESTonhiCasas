package banco.persistence.model.dao;

import banco.model.entity.TarjetaCredito;

public interface TarjetaDao {
	public void altaTarjeta(TarjetaCredito tarjeta);
	public TarjetaCredito buscarPorNumero(String numero);
	public void bloquearTarjeta(String numero);
	public void actualizarDisponible(String numero, int disponible);
}
