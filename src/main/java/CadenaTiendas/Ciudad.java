package CadenaTiendas;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
	private String _nombre;
	private String _codigoPostal;
	private List<Tienda> _tiendas;

	public Ciudad(String nombre, String codigoPostal) {
		this._nombre = nombre;
		this._codigoPostal = codigoPostal;
		this._tiendas = new ArrayList<>();
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		this._nombre = nombre;
	}

	public String getCodigoPostal() {
		return _codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this._codigoPostal = codigoPostal;
	}

	public List<Tienda> getTiendas() {
		return _tiendas;
	}

	public void setTiendas(List<Tienda> tiendas) {
		this._tiendas = tiendas;
	}

	public void agregarTienda(Tienda tienda) {
		_tiendas.add(tienda);
	}

	public boolean eliminarTienda(Tienda tienda) {
		return _tiendas.remove(tienda);
	}
}
