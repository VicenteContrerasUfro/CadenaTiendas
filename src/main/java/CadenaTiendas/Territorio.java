package CadenaTiendas;

import java.util.List;
import java.util.Vector;
import CadenaTiendas.Region;

public class Territorio {
	private String _nombre;
	private List<Region> _regiones;
	public Vector<Region> _unnamed_Region_ = new Vector<Region>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public List<Region> getRegiones() {
		throw new UnsupportedOperationException();
	}

	public void setRegiones(List<Region> aRegiones) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarRegion(String aNombreRegion, List<Ciudad> aCiudades) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarRegion(String aNombreRegion, Region aNuevosDatosRegion) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarRegion(String aNombreRegion) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarCiudad(String aNombreRegion, String aNombreCiudad, String aCodigoPostal) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarCiudad(String aNombreCiudad, String aCodigoPostal, Ciudad aNuevosDatosCiudad) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarCiudad(String aNombreCiudad, String aCodigoPostal) {
		throw new UnsupportedOperationException();
	}

	public List<Region> consultarRegionesCiudades() {
		throw new UnsupportedOperationException();
	}
}