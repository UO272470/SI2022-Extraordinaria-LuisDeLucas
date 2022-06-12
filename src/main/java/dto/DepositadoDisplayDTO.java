package dto;

public class DepositadoDisplayDTO {
	
	private String idPaquete;
	private String idRepartidor;
	private String idAlmacen;
	private String Depositado;
	
	public DepositadoDisplayDTO() {}
	public DepositadoDisplayDTO(String idPaquete, String idRepartidor, String idAlmacen, String depositado) {
		this.idPaquete = idPaquete;
		this.idRepartidor = idRepartidor;
		this.idAlmacen = idAlmacen;
		Depositado = depositado;
	}
	
	public String getIdPaquete() {
		return idPaquete;
	}

	public void setIdPaquete(String idPaquete) {
		this.idPaquete = idPaquete;
	}
	public String getIdRepartidor() {
		return idRepartidor;
	}
	public void setIdRepartidor(String idRepartidor) {
		this.idRepartidor = idRepartidor;
	}
	public String getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(String idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public String getDepositado() {
		return Depositado;
	}
	public void setDepositado(String depositado) {
		Depositado = depositado;
	}
	
	
}
