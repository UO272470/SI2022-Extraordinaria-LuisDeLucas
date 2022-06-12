package dto;

public class RecogeDisplayDTO {
	
	private String idCliente;
	private String idAlmacen;
	private String idPaquete;
	private String Recogido;
	
	public RecogeDisplayDTO() {}
	public RecogeDisplayDTO(String idCliente, String idAlmacen, String idPaquete, String recogido) {
		this.idCliente = idCliente;
		this.idAlmacen = idAlmacen;
		this.idPaquete = idPaquete;
		Recogido = recogido;
	}
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(String idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public String getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(String idPaquete) {
		this.idPaquete = idPaquete;
	}
	public String getRecogido() {
		return Recogido;
	}
	public void setRecogido(String recogido) {
		Recogido = recogido;
	}
	
	
	
	
}
