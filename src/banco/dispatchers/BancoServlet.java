package banco.dispatchers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import banco.controllers.ejb.AltaTarjetaControllerEjb;
import banco.controllers.ejb.ActualizarDisponibleControllerEjb;
import banco.controllers.ejb.BuscarPorNumeroControllerEjb;
import banco.controllers.ejb.PagoControllerEjb;
import banco.model.entity.TarjetaCredito;

/**
 * Servlet implementation class bancoServlet
 */
@WebServlet("/Banco/*")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BancoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// por aquí llega lo pinchado en enlaces
		String action= request.getPathInfo().substring(1);
		request.setCharacterEncoding("UTF-8");
		String titulo="Sin titulo";
		RequestDispatcher rd;	
		
		switch (action){
		case "altaTarjeta1":
			rd=request.getRequestDispatcher("/jsp/altaTarjeta.jsp");
			rd.forward(request,response);
			break;
		case "ampliarDisponible1":
			rd=request.getRequestDispatcher("/jsp/buscarTarjeta.jsp");
			rd.forward(request,response);
			break;
		case "pago1":
			rd=request.getRequestDispatcher("/jsp/pago.jsp");
			rd.forward(request,response);
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action= request.getPathInfo().substring(1);
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher rd;
		String titulo="Sin titulo";
		
		switch (action){
		case "altaTarjeta2":
			
			String numero = request.getParameter("numero");
			int cupoMaximo = Integer.parseInt(request.getParameter("cupoMaximo"));
			int cupoDisponible = Integer.parseInt(request.getParameter("cupoDisponible"));
			String tipo = request.getParameter("tipo");
			String numeroComprobacion = request.getParameter("numeroComprobacion");
			String contrasenha = request.getParameter("contrasenha");
			boolean bloqueada = Boolean.getBoolean(request.getParameter("bloqueada"));
			
			TarjetaCredito tarjeta = new TarjetaCredito(numero, cupoMaximo, 
					cupoDisponible,tipo,numeroComprobacion,contrasenha,bloqueada,0);
			AltaTarjetaControllerEjb controlador = new AltaTarjetaControllerEjb();
			controlador.altaTarjeta(tarjeta);
			rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
			break;
		case "ampliarDisponible2":
			String num1 = request.getParameter("numero");
			//buscar por numero de tarjeta
			BuscarPorNumeroControllerEjb controlador1 = new BuscarPorNumeroControllerEjb();
			TarjetaCredito tarjeta1= controlador1.buscarTarjeta(num1);
			request.setAttribute("titulo", "Ampliar Disponible");
			request.setAttribute("numero", tarjeta1.getNumero());
			request.setAttribute("cupoDisponible", tarjeta1.getCupoDisponible());
			request.setAttribute("accion", "Ampliar Disponible");
			rd = request.getRequestDispatcher("/jsp/modificar.jsp");
			rd.forward(request, response);
			break;
		case "ampliarDisponible3":
			String num2 = request.getParameter("numero");
			int disponible = Integer.parseInt(request.getParameter("disponible"));
			ActualizarDisponibleControllerEjb controlador2 = new ActualizarDisponibleControllerEjb();
			controlador2.actualizarDisponible(num2, disponible);
			rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
			break;
		case "pago2":
			String num3 = request.getParameter("numero");
			String contrasenha1 = request.getParameter("contrasenha");
			String numeroComprobacion1 = request.getParameter("numeroComprobacion");
			int importe = Integer.parseInt(request.getParameter("importe"));
			PagoControllerEjb controlador3 = new PagoControllerEjb();
			controlador3.pagoTarjeta(num3, contrasenha1, numeroComprobacion1, importe);
			rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
			break;
		default:
			break;
		}
	
	
	}

}
