package CadenaTiendas;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CiudadTest {

    private Ciudad ciudad;
    private Tienda tienda1;
    private Tienda tienda2;

    @Before
    public void setUp() {
        // Inicializar la ciudad y algunas tiendas para las pruebas
        ciudad = new Ciudad("Ciudad Central", "12345");
        tienda1 = new Tienda("Tienda A", "Calle 1", "9:00-18:00");
        tienda2 = new Tienda("Tienda B", "Calle 2", "10:00-20:00");
    }

    @Test
    public void testCrearCiudad() {
        // Verificar que los datos iniciales de la ciudad son correctos
        assertEquals("Ciudad Central", ciudad.getNombre());
        assertEquals("12345", ciudad.getCodigoPostal());
    }

    @Test
    public void testModificarNombreCiudad() {
        // Modificar el nombre de la ciudad y verificar el cambio
        ciudad.setNombre("Ciudad Nueva");
        assertEquals("Ciudad Nueva", ciudad.getNombre());
    }

    @Test
    public void testModificarCodigoPostalCiudad() {
        // Modificar el código postal de la ciudad y verificar el cambio
        ciudad.setCodigoPostal("54321");
        assertEquals("54321", ciudad.getCodigoPostal());
    }

    @Test
    public void testAgregarTienda() {
        // Agregar una tienda a la ciudad y verificar que ha sido añadida
        ciudad.agregarTienda(tienda1);
        List<Tienda> tiendas = ciudad.getTiendas();
        assertTrue(tiendas.contains(tienda1));
        assertEquals(1, tiendas.size());
    }

    @Test
    public void testEliminarTienda() {
        // Agregar dos tiendas, luego eliminar una y verificar que la lista se actualiza
        ciudad.agregarTienda(tienda1);
        ciudad.agregarTienda(tienda2);
        boolean resultado = ciudad.eliminarTienda(tienda1);

        assertTrue(resultado);
        List<Tienda> tiendas = ciudad.getTiendas();
        assertFalse(tiendas.contains(tienda1));
        assertEquals(1, tiendas.size());
    }
}
