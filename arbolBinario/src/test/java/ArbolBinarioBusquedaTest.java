import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArbolBinarioBusquedaTest {
    private ArbolBinarioBusqueda arbol;

    @Before
    public void setUp() {
        arbol = new ArbolBinarioBusqueda();
    }

    @Test
    public void testInsertarYBuscar() {
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(15);

        assertTrue(arbol.buscar(10));
        assertTrue(arbol.buscar(5));
        assertTrue(arbol.buscar(15));
        assertFalse(arbol.buscar(20));
    }
}
