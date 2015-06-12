package banco.controllers.ejb;

import banco.controllers.PagoController;
import banco.model.entity.TarjetaCredito;
import banco.persistence.model.dao.TarjetaDao;
import banco.persistence.model.dao.jdbc.TarjetaDaoJdbc;

public class PagoControllerEjb implements PagoController{
	public TarjetaDao tarjetaDao;
	@Override
	public void pagoTarjeta(String numero, String contrasenha,
			String numeroComprobacion, int importe) {
		//comprobar numero y contraseña
		tarjetaDao = new TarjetaDaoJdbc();
		TarjetaCredito tarjeta = tarjetaDao.buscarPorNumero(numero);
		// validaciones
		String mensaje;
		if (tarjeta.getContrasenha() != contrasenha){
			mensaje = "Contraseña incorrecta";
		}else if (tarjeta.getNumeroComprobacion()!= numeroComprobacion){
			mensaje = "Numero de comprobación incorrecto";
		}else if (tarjeta.getCupoDisponible() < importe + 20){
			mensaje = "Saldo Disponible insuficiente";
		}else{
			int nuevoDisponible = tarjeta.getCupoDisponible() - importe;
			tarjetaDao.actualizarDisponible(numero, nuevoDisponible);
		}
			
	}



}
