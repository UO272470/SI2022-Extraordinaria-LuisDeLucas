package entity;

public class DepositadoEntity {
	private int idPaquete;
	private int idRepartidor;
	private int idAlmacen;
	private boolean Depositado;
	
	public int getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(int idPaquete) {
		this.idPaquete = idPaquete;
	}
	public int getIdRepartidor() {
		return idRepartidor;
	}
	public void setIdRepartidor(int idRepartidor) {
		this.idRepartidor = idRepartidor;
	}
	public int getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public boolean isDepositado() {
		return Depositado;
	}
	public void setDepositado(boolean depositado) {
		Depositado = depositado;
	}
	
	
}
