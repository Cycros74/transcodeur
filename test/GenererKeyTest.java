/**
import org.junit.Assert;
import org.junit.Test;

public class GenererKeyTest{

    @Test
    public void testGen() {
        GenKey testGermain = new GenererKey("DUDULE");
        System.out.println(testGermain.getGeneratedKey());
        System.out.println(testGermain.getGeneratedCryptedKey());
        Assert.assertTrue("ça marche pas !!!",testGermain.getGeneratedCryptedKey() != null);
    }
}**/