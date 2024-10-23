package CadenaTiendas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmpleadoTest {

    private Empleado empleado;

    @Before
    public void setUp() {
        // Configuración inicial de un empleado antes de cada prueba
        empleado = new Empleado("Juan Pérez", "EMP001", "Cajero");
    }

    @Test
    public void testCrearEmpleado() {
        // Verificar que los datos iniciales del empleado son correctos
        assertEquals("Juan Pérez", empleado.getNombre());
        assertEquals("EMP001", empleado.getId());
        assertEquals("Cajero", empleado.getCargo());
    }

    @Test
    public void testModificarEmpleado() {
        // Modificar los datos del empleado y verificar que los cambios se hayan aplicado
        Empleado nuevosDatos = new Empleado("Pedro López", "EMP001", "Gerente");
        boolean resultado = empleado.modificarEmpleado("EMP001", nuevosDatos);

        assertTrue(resultado);
        assertEquals("Pedro López", empleado.getNombre());
        assertEquals("Gerente", empleado.getCargo());
    }

    @Test
    public void testEliminarEmpleado() {
        // Eliminar el empleado y verificar que los datos se han eliminado
        boolean resultado = empleado.eliminarEmpleado("EMP001");

        assertTrue(resultado);
        assertNull(empleado.getNombre());
        assertNull(empleado.getCargo());
    }
}
