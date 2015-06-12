package banco.controllers.ejb;

import banco.controllers.BuscarPorNumeroController;
import banco.model.entity.TarjetaCredito;
import banco.persistence.model.dao.TarjetaDao;
import banco.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class BuscarPorNumeroControllerEjb implements BuscarPorNumeroController{
	public TarjetaDao tarjetaDao;
	@Override
	public TarjetaCredito buscarTarjeta(String numero) {
		tarjetaDao = new TarjetaDaoJdbc();
		return tarjetaDao.buscarPorNumero(numero);
	}

}
