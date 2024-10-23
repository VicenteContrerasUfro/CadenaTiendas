package CadenaTiendas;

public class Cliente {
	private String nombre;
	private String numeroCliente;

	public Cliente(String nombre, String numeroCliente) {
		this.nombre = nombre;
		this.numeroCliente = numeroCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public boolean modificarCliente(String numeroCliente, Cliente nuevosDatos) {
		if (this.numeroCliente.equals(numeroCliente)) {
			this.nombre = nuevosDatos.getNombre();
			return true;
		}
		return false;
	}

	public boolean eliminarCliente(String numeroCliente) {
		if (this.numeroCliente.equals(numeroCliente)) {
			this.nombre = null;
			this.numeroCliente = null;
			return true;
		}
		return false;
	}
}
