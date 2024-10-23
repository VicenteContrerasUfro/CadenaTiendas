package CadenaTiendas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {

    private Cliente cliente;

    @Before
    public void setUp() {
        // Configuración inicial del cliente antes de cada prueba
        cliente = new Cliente("Juan Pérez", "CL001");
    }

    @Test
    public void testCrearCliente() {
        // Verificar que los datos iniciales del cliente son correctos
        assertEquals("Juan Pérez", cliente.getNombre());
        assertEquals("CL001", cliente.getNumeroCliente());
    }

    @Test
    public void testModificarCliente() {
        // Modificar los datos del cliente y verificar que el cambio se haya aplicado correctamente
        Cliente nuevosDatos = new Cliente("Pedro López", "CL001");
        boolean resultado = cliente.modificarCliente("CL001", nuevosDatos);

        assertTrue(resultado);
        assertEquals("Pedro López", cliente.getNombre());
    }

    @Test
    public void testEliminarCliente() {
        // Eliminar el cliente y verificar que los datos han sido eliminados
        boolean resultado = cliente.eliminarCliente("CL001");

        assertTrue(resultado);
        assertNull(cliente.getNombre());
        assertNull(cliente.getNumeroCliente());
    }
}
