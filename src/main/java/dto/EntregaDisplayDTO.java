package dto;

public class EntregaDisplayDTO {
	
	private String idRepartidor;
	private String idCliente;
	private String idPaquete;
	private String nEntregas;
	private String Entregado;
	private String Aceptado;
	
	public EntregaDisplayDTO() {}
	public EntregaDisplayDTO(String idRepartidor, String idCliente, String idPaquete, String nEntregas,
			String entregado, String aceptado) {
		this.idRepartidor = idRepartidor;
		this.idCliente = idCliente;
		this.idPaquete = idPaquete;
		this.nEntregas = nEntregas;
		Entregado = entregado;
		Aceptado = aceptado;
	}
	public String getIdRepartidor() {
		return idRepartidor;
	}
	public void setIdRepartidor(String idRepartidor) {
		this.idRepartidor = idRepartidor;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(String idPaquete) {
		this.idPaquete = idPaquete;
	}
	public String getnEntregas() {
		return nEntregas;
	}
	public void setnEntregas(String nEntregas) {
		this.nEntregas = nEntregas;
	}
	public String getEntregado() {
		return Entregado;
	}
	public void setEntregado(String entregado) {
		Entregado = entregado;
	}
	public String getAceptado() {
		return Aceptado;
	}
	public void setAceptado(String aceptado) {
		Aceptado = aceptado;
	}
	
	
	
	
}
