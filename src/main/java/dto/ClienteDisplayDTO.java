package dto;

public class ClienteDisplayDTO {

	private String idCliente;
	private String Nombre;
	private String Direccion;
	private String Ciudad;
	private String Provincia;
	
	public ClienteDisplayDTO() {}
	public ClienteDisplayDTO(String idCliente, String nombre, String direccion, String ciudad, String provincia) {
		this.idCliente = idCliente;
		Nombre = nombre;
		Direccion = direccion;
		Ciudad = ciudad;
		Provincia = provincia;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	
	
	
	
}

