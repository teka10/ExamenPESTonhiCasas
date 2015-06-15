package banco.persistence.model.dao.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import banco.model.entity.TarjetaCredito;
import banco.persistence.model.dao.TarjetaDao;

public class TarjetaDaoJdbc implements TarjetaDao{
	private Connection cx;
	
	public TarjetaDaoJdbc() {
		super();
	}

	@Override
	public void altaTarjeta(TarjetaCredito tarjeta) {
		try {
			abrirConexion();
			PreparedStatement ps=cx.prepareStatement
					("INSERT INTO TARJETACREDITO VALUES(?,?,?,?,?,?,?,?)");
			ps.setString(1,tarjeta.getNumero());
			ps.setInt(2,tarjeta.getCupoMaximo());
			ps.setInt(3,tarjeta.getCupoDisponible());
			ps.setString(4,tarjeta.getTipo());
			ps.setString(5,tarjeta.getNumeroComprobacion());
			ps.setString(6,tarjeta.getContrasenha());
			ps.setBoolean(7,tarjeta.isBloqueada());
			ps.setInt(8,0);
			
			ps.executeUpdate();
			cx.commit();
		} catch (SQLException e) {
			try {
				cx.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		cerrarConexion();
	}

	@Override
	public TarjetaCredito buscarPorNumero(String numero) {
		TarjetaCredito tarjeta = new TarjetaCredito();
		try {
			abrirConexion();
			PreparedStatement ps=cx.prepareStatement
					("SELECT * FROM TARJETACREDITO WHERE (NUMERO = ?)");
			ps.setString(1,numero);
			
			ResultSet consulta = ps.executeQuery();
			consulta.next();
			tarjeta.setNumero(numero);
			tarjeta.setCupoMaximo(consulta.getInt("cupoMaximo"));
			tarjeta.setCupoDisponible(consulta.getInt("cupoDisponible"));
			tarjeta.setTipo(consulta.getString("tipo"));
			tarjeta.setNumeroComprobacion(consulta.getString("numeroComprobacion"));
			tarjeta.setContrasenha(consulta.getString("contrasenha"));
			tarjeta.setBloqueada(consulta.getBoolean("bloqueada"));
			tarjeta.setId(consulta.getInt("id"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			cerrarConexion();
		}
		return tarjeta;
	}

	@Override
	public void actualizarDisponible(String numero, int disponible) {

		try {
			abrirConexion();
			PreparedStatement ps=cx.prepareStatement
					("UPDATE TARJETACREDITO SET CUPODISPONIBLE = ? WHERE NUMERO = ?");
			ps.setInt(1,disponible);
			ps.setString(2,numero);

			ps.executeUpdate();
			cx.commit();
		} catch (SQLException e) {
			try {
				cx.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		cerrarConexion();
	}

	@Override
	public void bloquear(String numero) {
		try {
			abrirConexion();
			PreparedStatement ps=cx.prepareStatement
					("UPDATE TARJETACREDITO SET BLOQUEADA = TRUE WHERE NUMERO = ?");
			ps.setString(1,numero);

			ps.executeUpdate();
			cx.commit();
		} catch (SQLException e) {
			try {
				cx.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		cerrarConexion();
		
	}


	public void abrirConexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/Banco",
					"root", "root");
			cx.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void cerrarConexion(){
		try {
			if (cx!=null)
				cx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}



}
