package CadenaTiendas;

import java.util.List;
import java.util.Vector;
import CadenaTiendas.Ciudad;

public class Region {
	private String _nombre;
	private List<Ciudad> _ciudades;
	public Territorio _unnamed_Territorio_;
	public Vector<Ciudad> _unnamed_Ciudad_ = new Vector<Ciudad>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public List<Ciudad> getCiudades() {
		throw new UnsupportedOperationException();
	}

	public void setCiudades(List<Ciudad> aCiudades) {
		throw new UnsupportedOperationException();
	}
}