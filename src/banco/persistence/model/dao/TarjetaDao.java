package banco.persistence.model.dao;

import banco.model.entity.TarjetaCredito;

public interface TarjetaDao {
	public String altaTarjeta(TarjetaCredito tarjeta);
	public TarjetaCredito buscarPorNumero(String numero);
	public String bloquear(String numero);
	public String actualizarDisponible(String numero, int disponible);

}
