package CadenaTiendas;

import java.util.List;

public class Empleado {
	private String _nombre;
	private String _idEmpleado;
	private String _cargo;
	public Tienda _unnamed_Tienda_;

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getIdEmpleado() {
		return this._idEmpleado;
	}

	public void setIdEmpleado(String aIdEmpleado) {
		this._idEmpleado = aIdEmpleado;
	}

	public String getCargo() {
		return this._cargo;
	}

	public void setCargo(String aCargo) {
		this._cargo = aCargo;
	}

	public boolean agregarEmpleado(String aNombre, String aIdEmpleado, String aCargo) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarEmpleado(String aIdEmpleado, Empleado aNuevosDatosEmpleado) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarEmpleado(Empleado aEmpleado) {
		throw new UnsupportedOperationException();
	}

	public List<Empleado> consultarEmpleados() {
		throw new UnsupportedOperationException();
	}
}