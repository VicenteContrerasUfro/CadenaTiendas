package CadenaTiendas;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String _nombre;
	private List<Ciudad> _ciudades;

	public Region(String nombre, List<Ciudad> ciudades) {
		this._nombre = nombre;
		this._ciudades = ciudades;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String nombre) {
		this._nombre = nombre;
	}

	public List<Ciudad> getCiudades() {
		return this._ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this._ciudades = ciudades;
	}

	/**
	 * Modificar los datos de una región si el nombre coincide.
	 */
	public boolean modificarRegion(String nombre, Region nuevosDatos) {
		if (this._nombre.equals(nombre)) {
			this._nombre = nuevosDatos.getNombre();
			this._ciudades = nuevosDatos.getCiudades();
			return true;
		}
		return false;
	}

	/**
	 * Elimina una región si el nombre coincide.
	 * En una implementación real, este método probablemente eliminaría la región de alguna lista global.
	 */
	public boolean eliminarRegion(String nombre) {
		if (this._nombre.equals(nombre)) {
			// Aquí podrías agregar la lógica para eliminar la región de algún contenedor.
			this._nombre = null;
			this._ciudades = null;
			return true;
		}
		return false;
	}
}
