package CadenaTiendas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
	private String numeroCompra;
	private Date fecha;
	private double total;
	private String formaPago;
	private List<Producto> productos;

	public Compra(String numeroCompra, Date fecha, String formaPago) {
		this.numeroCompra = numeroCompra;
		this.fecha = fecha;
		this.formaPago = formaPago;
		this.total = 0; // Inicializa el total en 0
		this.productos = new ArrayList<>();
	}

	public String getNumeroCompra() {
		return numeroCompra;
	}

	public Date getFecha() {
		return fecha;
	}

	public double getTotal() {
		return total;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void agregarProducto(Producto producto, int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			productos.add(producto); // Agrega el producto múltiples veces según la cantidad
		}
		this.total += producto.getPrecio() * cantidad; // Actualiza el total
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public boolean eliminarCompra(String numeroCompra) {
		if (this.numeroCompra.equals(numeroCompra)) {
			this.numeroCompra = null;
			this.fecha = null;
			this.total = 0;
			this.formaPago = null;
			this.productos.clear();
			return true;
		}
		return false;
	}
	public void registrarCompra(Producto producto, int cantidad) {
		agregarProducto(producto, cantidad);
	}

}
