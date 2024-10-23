package CadenaTiendas;

import java.util.List;
import java.util.Vector;
import CadenaTiendas.Empleado;
import CadenaTiendas.Producto;
import CadenaTiendas.Compra;

public class Tienda {
	private String _nombre;
	private String _direccion;
	private String _horarioAtencion;
	private List<Empleado> _empleados;
	private List<Producto> _inventario;
	public Ciudad _unnamed_Ciudad_;
	public Vector<Empleado> _unnamed_Empleado_ = new Vector<Empleado>();
	public Vector<Producto> _unnamed_Producto_ = new Vector<Producto>();
	public Vector<Compra> _unnamed_Compra_ = new Vector<Compra>();

	public Tienda(String tiendaA, String s, String s1) {
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getDireccion() {
		return this._direccion;
	}

	public void setDireccion(String aDireccion) {
		this._direccion = aDireccion;
	}

	public String getHorarioAtencion() {
		return this._horarioAtencion;
	}

	public void setHorarioAtencion(String aHorarioAtencion) {
		this._horarioAtencion = aHorarioAtencion;
	}

	public List<Empleado> getEmpleados() {
		throw new UnsupportedOperationException();
	}

	public void setEmpleados(List<Empleado> aEmpleados) {
		throw new UnsupportedOperationException();
	}

	public List<Producto> getInventario() {
		throw new UnsupportedOperationException();
	}

	public void setInventario(List<Producto> aInventario) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarTienda(String aNombreCiudad, String aNombreTienda, String aDireccion, String aHorarioAtencion) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarTienda(String aNombreTienda, Tienda aNuevosDatosTienda) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarTienda(String aNombreTienda) {
		throw new UnsupportedOperationException();
	}

	public boolean asignarEmpleados(String aNombreTienda, Empleado aEmpleado) {
		throw new UnsupportedOperationException();
	}

	public List<Tienda> consultarTiendas() {
		throw new UnsupportedOperationException();
	}
}