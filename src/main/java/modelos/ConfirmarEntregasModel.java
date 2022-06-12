package modelos;
import java.util.List;

import entity.EntregaEntity;
import entity.PaqueteEntity;
import entity.AlmacenEntity;
import entity.ClienteEntity;
import entity.DepositadoEntity;
import giis.demo.util.ApplicationException;
import giis.demo.util.Database;

public class ConfirmarEntregasModel {
	private Database db = new Database();
	
	public List<EntregaEntity> getEntregas(String idRepartidor) {
		String sql = "SELECT * FROM Entrega WHERE idRepartidor = ? AND Entregado = FALSE";
		
		return db.executeQueryPojo(EntregaEntity.class, sql, idRepartidor);
	}
	
	public List<DepositadoEntity> getDepositos(String idRepartidor) {
		String sql = "SELECT * FROM Deposita WHERE idRepartidor = ? AND Depositado = FALSE";
		
		return db.executeQueryPojo(DepositadoEntity.class, sql, idRepartidor);
	}
	
	public void entregadoExito(String paquete) {
		db.executeUpdate("UPDATE Entrega SET Entregado = TRUE WHERE idPaquete = ? ;", paquete);
	}
	
	public void depositoExito(String paquete) {
		db.executeUpdate("UPDATE Deposita SET Depositado = TRUE WHERE idPaquete = ? ;", paquete);
	}
	
	public void entregadoFallido(String paquete) {
		int nEntregas = db.executeQueryPojo(EntregaEntity.class,
				"SELECT * FROM Entrega WHERE idPaquete = ?", paquete).get(0).getnEntregas();
		
		if(nEntregas <= 2) {
			db.executeUpdate("UPDATE Entrega SET nEntregas = nEntregas + 1 WHERE idPaquete = ? ;", paquete);
		} else {
			int peso = db.executeQueryPojo(PaqueteEntity.class, "SELECT * FROM Paquete WHERE idPaquete = ?", paquete).get(0).getPeso();
			
			int idCliente = db.executeQueryPojo(EntregaEntity.class ,"SELECT * FROM Entrega WHERE idPaquete = ?", paquete ).get(0).getIdCliente();
			db.executeUpdate("DELETE FROM Entrega WHERE idPaquete = ?", paquete);
			
			
			
			formalizarEnvioAlmacen(idCliente, peso, "Oviedo");
		}
		
		
		
	}
	
	public void formalizarEnvioAlmacen(int idCliente, int peso, String nombreAlmacen) {
		
		int idPaquete = db.executeQueryPojo(PaqueteEntity.class, "Select * FROM Paquete WHERE Peso = ?", peso).get(0).getIdPaquete();
		int idAlmacen = db.executeQueryPojo(AlmacenEntity.class, "Select * FROM Almacen WHERE Nombre = ?", nombreAlmacen).get(0).getIdAlmacen();
		String sqlDepostia = "INSERT INTO \"Deposita\" (\"idPaquete\", \"idAlmacen\", \"Depositado\") VALUES\r\n"
				+ "	(?, ?, FALSE);";
		String sqlRecoge = "INSERT INTO \"Recoge\" (\"idCliente\", \"idAlmacen\", \"idPaquete\", \"Recogido\") VALUES\r\n"
				+ "	(?, ?, ?, FALSE);";
		
		
		
		db.executeUpdate(sqlDepostia, idPaquete, idAlmacen);
		db.executeUpdate(sqlRecoge, idCliente, idAlmacen, idPaquete);
	}
	
}
