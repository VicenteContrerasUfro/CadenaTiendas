package CadenaTiendas;

import java.util.List;
import java.util.Vector;
import CadenaTiendas.Tienda;

public class Ciudad {
	private String _nombre;
	private String _codigoPostal;
	private List<Tienda> _tiendas;
	public Region _unnamed_Region_;
	public Vector<Tienda> _unnamed_Tienda_ = new Vector<Tienda>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getCodigoPostal() {
		return this._codigoPostal;
	}

	public void setCodigoPostal(String aCodigoPostal) {
		this._codigoPostal = aCodigoPostal;
	}

	public List<Tienda> getTiendas() {
		throw new UnsupportedOperationException();
	}

	public void setTiendas(List<Tienda> aTiendas) {
		throw new UnsupportedOperationException();
	}
}