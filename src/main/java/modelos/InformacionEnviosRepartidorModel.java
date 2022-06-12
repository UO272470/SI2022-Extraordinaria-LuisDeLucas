package modelos;

import giis.demo.util.Database;

import java.util.List;

import entity.ClienteEntity;
import entity.EntregaEntity;
import entity.PaqueteEntity;

public class InformacionEnviosRepartidorModel {
	private Database db = new Database();
	
	
	public List<EntregaEntity> getEntregas(String repartidor) {
		String sql = "SELECT idCliente, idPaquete FROM Entrega WHERE idRepartidor = ?";
		
		return db.executeQueryPojo(EntregaEntity.class, sql, repartidor);
	}

	public List<ClienteEntity> getCliente(String idCliente) {
		String sql = "Select * FROM Cliente WHERE idCliente = ?";
		
		return db.executeQueryPojo(ClienteEntity.class, sql, idCliente);
	}
	
	public List<PaqueteEntity> getPaquete(String idPaquete) {
		String sql = "Select * FROM Paquete WHERE idPaquete = ?";
		
		return db.executeQueryPojo(PaqueteEntity.class, sql, idPaquete);
	}
}
