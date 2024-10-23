package CadenaTiendas;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CompraTest {

    private Compra compra;
    private Producto producto;

    @Before
    public void setUp() {
        // Configuración inicial de una compra y un producto antes de cada prueba
        compra = new Compra("C001", new Date(), "Tarjeta de Crédito");
        producto = new Producto("P001", "Laptop", 500.0);
    }

    @Test
    public void testRegistrarCompra() {
        Producto producto = new Producto("P001", "Descripción del producto", 500.0);
        Compra compra = new Compra("C001", new Date(), "Tarjeta");

        compra.registrarCompra(producto, 1);

        assertFalse(compra.getProductos().isEmpty()); // Verifica que se haya agregado un producto
        assertEquals(500.0, compra.getTotal(), 0); // Verifica el total
        assertEquals("P001", compra.getProductos().get(0).getIdProducto()); // Verifica el código del producto
    }


    @Test
    public void testAgregarProducto() {
        Producto producto = new Producto("P001", "Descripción del producto", 500.0);
        Compra compra = new Compra("C001", new Date(), "Tarjeta");

        compra.agregarProducto(producto, 1); // Agrega el producto a la compra

        assertFalse(compra.getProductos().isEmpty()); // Verifica que se haya agregado un producto
        assertEquals(500.0, compra.getTotal(), 0); // Verifica el total
        assertEquals("P001", compra.getProductos().get(0).getIdProducto()); // Verifica el código del producto
    }



    @Test
    public void testEliminarCompra() {
        // Eliminar la compra y verificar que los datos han sido eliminados
        boolean resultado = compra.eliminarCompra("C001");

        assertTrue(resultado);
        assertNull(compra.getNumeroCompra());
        assertNull(compra.getFecha());
        assertEquals(0.0, compra.getTotal(), 0);
        assertNull(compra.getFormaPago());
        assertTrue(compra.getProductos().isEmpty());
    }
}
