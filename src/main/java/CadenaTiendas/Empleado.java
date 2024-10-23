package CadenaTiendas;

public class Empleado {
	private String nombre;
	private String id;
	private String cargo;

	public Empleado(String nombre, String id, String cargo) {
		this.nombre = nombre;
		this.id = id;
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public boolean modificarEmpleado(String id, Empleado nuevosDatos) {
		if (this.id.equals(id)) {
			this.nombre = nuevosDatos.getNombre();
			this.cargo = nuevosDatos.getCargo();
			return true;
		}
		return false;
	}

	public boolean eliminarEmpleado(String id) {
		if (this.id.equals(id)) {
			this.nombre = null;
			this.cargo = null;
			return true;
		}
		return false;
	}
}
