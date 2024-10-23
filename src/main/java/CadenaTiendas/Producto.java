package CadenaTiendas;

import java.util.List;
import java.util.Map;
import java.util.Vector;
import CadenaTiendas.Compra;

public class Producto {
	private String _idProducto;
	private String _descripcion;
	private double _precio;
	private String _categoria;
	public Tienda _unnamed_Tienda_;
	public Vector<Compra> _unnamed_Compra_ = new Vector<Compra>();

	public Producto(String p001, String laptop, double v) {
	}

	public String getIdProducto() {
		return this._idProducto;
	}

	public void setIdProducto(String IdProducto) {
		this._idProducto = IdProducto;
	}

	public String getDescripcion() {
		return this._descripcion;
	}

	public void setDescripcion(String aDescripcion) {
		this._descripcion = aDescripcion;
	}

	public double getPrecio() {
		return this._precio;
	}

	public void setPrecio(double aPrecio) {
		this._precio = aPrecio;
	}

	public String getCategoria() {
		return this._categoria;
	}

	public void setCategoria(String aCategoria) {
		this._categoria = aCategoria;
	}

	public boolean agregarProducto(String aIdProducto, String aDescripcion, double aPrecio, String aCategoria) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarProducto(String aIdProducto, Producto aNuevosDatosProducto) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarProducto(String aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public boolean actualizarInventario(String aIdProducto, int aCantidad, Tienda aTienda) {
		throw new UnsupportedOperationException();
	}

	public List<Producto> consultarProductos() {
		throw new UnsupportedOperationException();
	}

	public Map<Tienda, Integer> consultarInventario(String aIdProducto) {
		throw new UnsupportedOperationException();
	}
}