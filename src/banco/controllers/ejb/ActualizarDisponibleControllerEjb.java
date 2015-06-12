package banco.controllers.ejb;

import banco.controllers.ActualizarDisponibleController;
import banco.persistence.model.dao.TarjetaDao;
import banco.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class ActualizarDisponibleControllerEjb implements ActualizarDisponibleController{
	public TarjetaDao tarjetaDao;
	@Override
	public void actualizarDisponible(String numero, int disponible) {
		tarjetaDao = new TarjetaDaoJdbc();
		tarjetaDao.actualizarDisponible(numero, disponible);
	}

}
