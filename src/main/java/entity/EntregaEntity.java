package entity;

public class EntregaEntity {
	private int idRepartidor;
	private int idCliente;
	private int idPaquete;
	private int nEntregas;
	private boolean Entregado;
	private boolean Aceptado;
	
	public int getIdRepartidor() {
		return idRepartidor;
	}
	public void setIdRepartidor(int idRepartidor) {
		this.idRepartidor = idRepartidor;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(int idPaquete) {
		this.idPaquete = idPaquete;
	}
	public int getnEntregas() {
		return nEntregas;
	}
	public void setnEntregas(int nEntregas) {
		this.nEntregas = nEntregas;
	}
	public boolean isEntregado() {
		return Entregado;
	}
	public void setEntregado(boolean entregado) {
		Entregado = entregado;
	}
	public boolean isAceptado() {
		return Aceptado;
	}
	public void setAceptado(boolean aceptado) {
		Aceptado = aceptado;
	}
	
	
}
