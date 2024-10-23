package CadenaTiendas;

import java.util.List;

public class Cliente {
	private String _nombre;
	private String _idCliente;
	public Compra _unnamed_Compra_;

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getIdCliente() {
		return this._idCliente;
	}

	public void setIdCliente(String aIdCliente) {
		this._idCliente = aIdCliente;
	}

	public boolean registrarCliente(String aNombre, String aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarCliente(String aIdCliente, Cliente aNuevosDatosCliente) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarCliente(String aIdCliente) {
		throw new UnsupportedOperationException();
	}

	public List<Cliente> consultarClientes() {
		throw new UnsupportedOperationException();
	}
}