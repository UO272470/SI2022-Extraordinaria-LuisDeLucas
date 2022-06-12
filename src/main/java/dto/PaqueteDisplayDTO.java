package dto;

public class PaqueteDisplayDTO {
	private String idPaquete;
	private String Peso;
	private String Precio;
	
	public PaqueteDisplayDTO() {}
	public PaqueteDisplayDTO(String rowidPaquete, String rowPeso, String rowPrecio) {
		this.idPaquete = rowidPaquete;
		this.Peso = rowPeso;
		this.Precio = rowPrecio;
	}
	public String getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(String idPaquete) {
		this.idPaquete = idPaquete;
	}
	public String getPeso() {
		return Peso;
	}
	public void setPeso(String peso) {
		Peso = peso;
	}
	public String getPrecio() {
		return Precio;
	}
	public void setPrecio(String precio) {
		Precio = precio;
	}
	
	
}
