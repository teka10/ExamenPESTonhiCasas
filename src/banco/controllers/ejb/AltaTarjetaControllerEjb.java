package banco.controllers.ejb;

import banco.controllers.AltaTarjetaController;
import banco.model.entity.TarjetaCredito;
import banco.persistence.model.dao.TarjetaDao;
import banco.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class AltaTarjetaControllerEjb implements AltaTarjetaController{
	public TarjetaDao tarjetaDao;
	@Override
	public void altaTarjeta(TarjetaCredito tarjeta) {
		tarjetaDao = new TarjetaDaoJdbc();
		tarjetaDao.altaTarjeta(tarjeta);
	}

}
