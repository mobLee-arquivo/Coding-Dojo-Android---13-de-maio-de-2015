package dojo.coding.anobissexto;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AnoBissextoTest extends TestCase {

    private VerificadorDeAnoBissexto verificadorDeAnoBissexto;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        verificadorDeAnoBissexto = new VerificadorDeAnoBissexto();
    }

    public void test2001NaoEhAnoBissexto() {
        Assert.assertFalse(verificadorDeAnoBissexto.ehAnoBissexto(2001));
    }

    public void test1996EhAnoBissexto() {
        Assert.assertTrue(verificadorDeAnoBissexto.ehAnoBissexto(1996));
    }

    public void test1900NaoEhBissexto() {
        Assert.assertFalse(verificadorDeAnoBissexto.ehAnoBissexto(1900));
    }

    public void test2000EhAnoBissexto() {
        Assert.assertTrue(verificadorDeAnoBissexto.ehAnoBissexto(2000));
    }

}
