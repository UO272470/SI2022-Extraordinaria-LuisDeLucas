package modelos;
import java.util.List;

import entity.EntregaEntity;
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
		db.executeUpdate("UPDATE Entrega SET nEntregas = nEntregas + 1 WHERE idPaquete = ? ;", paquete);
	}
	
}
