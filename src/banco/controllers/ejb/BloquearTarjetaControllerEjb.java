package banco.controllers.ejb;

import banco.controllers.BloquearTarjetaController;
import banco.persistence.model.dao.TarjetaDao;
import banco.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class BloquearTarjetaControllerEjb implements BloquearTarjetaController{

	@Override
	public String bloquearTarjeta(String numero) {
		TarjetaDao tarjetaDao = new TarjetaDaoJdbc();
		return tarjetaDao.bloquear(numero);
	}

}
