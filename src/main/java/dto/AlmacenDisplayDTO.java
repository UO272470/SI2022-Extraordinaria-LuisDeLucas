package dto;

public class AlmacenDisplayDTO {

	private String idAlmacen;
	private String Nombre;
	private String Direccion;
	private String Ciudad;
	private String Provincia;
	
	public AlmacenDisplayDTO() {}
	public AlmacenDisplayDTO(String idAlmacen, String nombre, String direccion, String ciudad, String provincia) {
		this.idAlmacen = idAlmacen;
		Nombre = nombre;
		Direccion = direccion;
		Ciudad = ciudad;
		Provincia = provincia;
	}
	public String getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(String idAlmacen) {
		this.idAlmacen = idAlmacen;
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
