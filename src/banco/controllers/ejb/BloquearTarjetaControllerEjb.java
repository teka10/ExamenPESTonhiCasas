package banco.controllers.ejb;

import banco.controllers.BloquearTarjetaController;
import banco.persistence.model.dao.TarjetaDao;
import banco.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class BloquearTarjetaControllerEjb implements BloquearTarjetaController{

	@Override
	public void bloquearTarjeta(String numero) {
		TarjetaDao tarjetaDao = new TarjetaDaoJdbc();
		tarjetaDao.bloquear(numero);
		
	}

}
