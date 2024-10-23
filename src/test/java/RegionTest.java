package CadenaTiendas;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegionTest {

    private Region region;

    @Before
    public void setUp() {
        // Configuración inicial de la región antes de cada prueba
        region = new Region("Región Norte", new ArrayList<>());
    }

    @Test
    public void testModificarRegion() {
        Region nuevosDatos = new Region("Región Norte Actualizada", new ArrayList<>());

        boolean resultado = region.modificarRegion("Región Norte", nuevosDatos);
        assertTrue(resultado);
        assertEquals("Región Norte Actualizada", region.getNombre());
    }

    @Test
    public void testEliminarRegion() {
        boolean resultado = region.eliminarRegion("Región Norte");

        assertTrue(resultado);
        // Aquí deberías verificar que la región ya no está presente, dependiendo de tu lógica de eliminación
        // assertFalse(algunaFuncionQueVerifiqueSiLaRegionExiste(region));
    }
}

