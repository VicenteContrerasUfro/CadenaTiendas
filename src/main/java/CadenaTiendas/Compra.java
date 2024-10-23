package CadenaTiendas;

import java.util.Date;
import java.util.List;
import java.util.Vector;
import CadenaTiendas.Cliente;
import CadenaTiendas.Producto;

public class Compra {
	private String _idCompra;
	private Date _fecha;
	private double _total;
	private String _formaPago;
	public Tienda _unnamed_Tienda_;
	public Vector<Cliente> _unnamed_Cliente_ = new Vector<Cliente>();
	public Vector<Producto> _unnamed_Producto_ = new Vector<Producto>();

	public String getIdCompra() {
		return this._idCompra;
	}

	public void setIdCompra(String aIdCompra) {
		this._idCompra = aIdCompra;
	}

	public Date getFecha() {
		return this._fecha;
	}

	public void setFecha(Date aFecha) {
		this._fecha = aFecha;
	}

	public double getTotal() {
		return this._total;
	}

	public void setTotal(double aTotal) {
		this._total = aTotal;
	}

	public String getFormaPago() {
		return this._formaPago;
	}

	public void setFormaPago(String aFormaPago) {
		this._formaPago = aFormaPago;
	}

	public boolean registrarCompra(String aIdCompra, Date aFecha, double aTotal, String aFormaPago) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarProductos(Object aIdCompra, List<Producto> aProductos) {
		throw new UnsupportedOperationException();
	}

	public boolean actualizarInventario(List<Producto> aProductos, Tienda aTienda) {
		throw new UnsupportedOperationException();
	}

	public List<Compra> consultarCompra() {
		throw new UnsupportedOperationException();
	}
}