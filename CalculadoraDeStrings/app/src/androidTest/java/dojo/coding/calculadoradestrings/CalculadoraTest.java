package dojo.coding.calculadoradestrings;

import static junit.framework.Assert.*;
import junit.framework.TestCase;

/**
 * Created by glauco on 5/13/15.
 */
public class CalculadoraTest extends TestCase {

    Calculadora calculadora;
    public void setUp(){
        calculadora = new Calculadora();
    }

    public void testeStringVazia() {
        assertEquals(0, calculadora.soma(""));
    }

    public void testeSoma1Numero(){
        assertEquals(1, calculadora.soma("1"));
    }

    public void testeSoma2Numeros() {
        assertEquals(3, calculadora.soma("1,2"));
    }

    public void testeSomaVariosNumeros() {
        assertEquals(10, calculadora.soma("1,2,3,4"));
    }

    public void testeSomaVariosNumerosComBarraN() {
        assertEquals(10, calculadora.soma("1\n2,3,4"));
    }

    public void testeSomaVariosNumerosComDelimitador() {
        assertEquals(6, calculadora.soma("//;\n1;2;3"));
    }

}
