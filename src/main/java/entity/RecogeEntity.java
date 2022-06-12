package entity;

public class RecogeEntity {
	private int idCliente;
	private int idAlmacen;
	private int idPaquete;
	private boolean Recogido;
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public int getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(int idPaquete) {
		this.idPaquete = idPaquete;
	}
	public boolean isRecogido() {
		return Recogido;
	}
	public void setRecogido(boolean recogido) {
		Recogido = recogido;
	}
	
	
}
