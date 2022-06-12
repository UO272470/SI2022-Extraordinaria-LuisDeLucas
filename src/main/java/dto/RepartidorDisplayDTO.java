package dto;

public class RepartidorDisplayDTO {	
	
	private String idRepartidor;
	private String Nombre;
	
	public RepartidorDisplayDTO() {}
	public RepartidorDisplayDTO(String rowidRepartidor, String rowNombre) {
		this.idRepartidor = rowidRepartidor;
		this.Nombre = rowNombre;
	}
	
	public String getId() {
		return idRepartidor;
	}
	
	public void setId(String idRepartidor) {
		this.idRepartidor = idRepartidor;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
}
