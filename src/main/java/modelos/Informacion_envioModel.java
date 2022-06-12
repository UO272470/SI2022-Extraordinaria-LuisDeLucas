package modelos;


import java.util.List;

import entity.AlmacenEntity;
import entity.ClienteEntity;
import entity.DepositadoEntity;
import entity.EntregaEntity;
import entity.PaqueteEntity;
import entity.RecogeEntity;
import giis.demo.util.ApplicationException;
import giis.demo.util.Database;

public class Informacion_envioModel {
	private Database db = new Database();
	
	public List<AlmacenEntity> getAlmacen() {
		String sql = "SELECT * FROM Almacen";
		return db.executeQueryPojo(AlmacenEntity.class, sql);
	}
	
	public void creapaqueteYcliente(String nombre, String direccion, String ciudad, String provincia, int peso) {
		String sqlCliente = "INSERT INTO \"Cliente\" (\"Nombre\", \"Direccion\", \"Ciudad\", \"Provincia\") VALUES\r\n"
				+ " (?, ?, ?, ?);";
		String sqlPaquete = "INSERT INTO \"Paquete\" (\"Peso\") VALUES\r\n"
				+ "	(?)";
		db.executeUpdate(sqlCliente, nombre, direccion, ciudad, provincia);
		db.executeUpdate(sqlPaquete, peso);
		
	}

	
	public void formalizarEnvioCasa(String nombre, int peso) {
		int idCliente = db.executeQueryPojo(ClienteEntity.class, "SELECT * FROM Cliente WHERE Nombre = ?;", nombre).get(0).getIdCliente();
		int idPaquete = db.executeQueryPojo(PaqueteEntity.class, "Select * FROM Paquete WHERE Peso = ?", peso).get(0).getIdPaquete();
		
		String sqlEntrega = "INSERT INTO \"Entrega\" (\"idCliente\",\"idPaquete\",\"nEntregas\",\"Entregado\",\"Aceptado\") VALUES "
				+ " (?, ?, 0, FALSE, FALSE)";
		
		db.executeUpdate(sqlEntrega, idCliente, idPaquete);
	}
	
	public void formalizarEnvioAlmacen(String nombre, int peso, String nombreAlmacen) {
		int idCliente = db.executeQueryPojo(ClienteEntity.class, "SELECT * FROM Cliente WHERE Nombre = ?;", nombre).get(0).getIdCliente();
		int idPaquete = db.executeQueryPojo(PaqueteEntity.class, "Select * FROM Paquete WHERE Peso = ?", peso).get(0).getIdPaquete();
		int idAlmacen = db.executeQueryPojo(AlmacenEntity.class, "Select * FROM Almacen WHERE Nombre = ?", nombreAlmacen).get(0).getIdAlmacen();
		String sqlDepostia = "INSERT INTO \"Deposita\" (\"idPaquete\", \"idAlmacen\", \"Depositado\") VALUES\r\n"
				+ "	(?, ?, FALSE);";
		String sqlRecoge = "INSERT INTO \"Recoge\" (\"idCliente\", \"idAlmacen\", \"idPaquete\", \"Recogido\") VALUES\r\n"
				+ "	(?, ?, ?, FALSE);";
		
		
		
		db.executeUpdate(sqlDepostia, idPaquete, idAlmacen);
		db.executeUpdate(sqlRecoge, idCliente, idAlmacen, idPaquete);
	}
	
	
	public List<EntregaEntity> buscarPaqueteCasa(String idPaquete) {
		return db.executeQueryPojo(EntregaEntity.class, "SELECT * FROM Entrega WHERE idPaquete = ?", idPaquete);
	}
	
	public List<RecogeEntity> buscarPaqueteOficina(String idPaquete) {
		return db.executeQueryPojo(RecogeEntity.class, "SELECT * FROM Recoge WHERE idPaquete = ?", idPaquete);
	}
	
	public List<ClienteEntity> buscarCliente(String idCliente) {
		return db.executeQueryPojo(ClienteEntity.class,"SELECT * FROM Cliente WHERE idCliente = ?" ,idCliente );
	}
	
	public void updateCliente(String n, String d, String C, String P, String cliente) {
		db.executeUpdate("UPDATE Cliente SET Nombre = ?, Direccion = ?, Ciudad = ?, Provincia = ? WHERE idCliente = ?",
				n, d, C, P, cliente);
	}
	
	public void borraEntregaCreaDeposito(String idPaquete, String nombre, String nombreAlmacen) {
		int peso = db.executeQueryPojo(PaqueteEntity.class, "SELECT * FROM Paquete WHERE idPaquete = ?", idPaquete).get(0).getPeso();
		db.executeUpdate("DELETE FROM Entrega WHERE idPaquete = ?", idPaquete);
		
		formalizarEnvioAlmacen(nombre, peso, nombreAlmacen);
	}
	
	public void borraDeposito(String idPaquete) {
		db.executeUpdate("DELETE FROM Deposita WHERE idPaquete = ?", idPaquete);
		db.executeUpdate("DELETE FROM Recoge WHERE idPaquete = ?", idPaquete);
	}
	
	public void formalizaEnvioCasaActualiza(String idPaquete, String nombre) {
		int idCliente = db.executeQueryPojo(ClienteEntity.class, "SELECT * FROM Cliente WHERE Nombre = ?;", nombre).get(0).getIdCliente();	
		String sqlEntrega = "INSERT INTO \"Entrega\" (\"idCliente\",\"idPaquete\",\"nEntregas\",\"Entregado\",\"Aceptado\") VALUES "
				+ " (?, ?, 0, FALSE, FALSE)";
		
		db.executeUpdate(sqlEntrega, idCliente, idPaquete);
	}
}
