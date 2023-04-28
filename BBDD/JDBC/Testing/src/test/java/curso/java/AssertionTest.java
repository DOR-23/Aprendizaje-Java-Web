package curso.java;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTest {
    @Test
    void assertionEquals_SameObjet(){
        int i1 = 5;
        int i2 = 5;

        assertEquals(i1,i2);
    }

    class Punto {
        int X;
        int y;

        public Punto(int x, int y){
        }

    }

    @Test
    void assertEquals_MismoPunto_True(){
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(1, 2);

        assertEquals(p1, p2);
    }

    @Test
    void assertEquals_PuntoDiferente_False(){
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(1, 2);

        assertNotEquals(p1,p2);
    }

    @Test
    void assertNull_NullObjet(){
        Punto p1 = null;

        assertNull(p1);
    }

}
