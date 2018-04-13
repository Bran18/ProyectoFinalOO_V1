package src.proyecto.logic;

public class Productos {

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", logo=" + logo + ", descripcion=" + descripcion + ", version="
				+ version + "]";
	}

	String nombre, logo, descripcion;
	Version version;

	public Productos(String nombre, String logo, String descripcion, Version version) {
		this.nombre = nombre;
		this.logo = logo;
		this.descripcion = descripcion;
		this.version = version;
	}

	public Productos() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

}
