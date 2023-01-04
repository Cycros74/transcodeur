import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.germain.tool.ManaBox;
import org.junit.Assert;
import tools.TransCoder;

public class ReadKeyTest {
    @Test
    public void readKeyTest() {
        // La clé cryptée donnée plus haut
        String keyCrypted = "6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==";
        // La clé décryptée que nous devrions obtenir
        String keyDecrypted = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
        // le test d'égalité entre la clé attendue et la sortie de la méthode de la librairie. Si le décryptage ne fonctionne pas nous aurons le message définit ici
        Assert.assertEquals("La librairie de décryptage est mal installée", keyDecrypted, ManaBox.decrypt(keyCrypted));

    }


    @Test
    public void testLissage() {
        // La clé décryptée que nous devrions obtenir
        String phrase = "ça éteint les lumières dans le ciel" + "";
        String lissage = StringUtils.stripAccents(phrase);
        System.out.println(lissage);
    }

    @Test
    public void createMapTest() {
        String testGermain = "6lUjKOzUj4e/Gelw9c6sDLqHniwulClN6XSayZ+HRF/kbZx+CMf95jxrhm4YFSY26OnxVlsrzGkO00IMeAFs3g==";
        TransCoder transcodeTest = new TransCoder(testGermain);
        Assert.assertNotNull(transcodeTest.getEncode());
        System.out.println(transcodeTest.getEncode().toString());
        Assert.assertNotNull(transcodeTest.getDecode());
        System.out.println(transcodeTest.getDecode().toString());
    }

    @Test
    public void testEncode() {
        String keyCrypted = "6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==";
        String msg = "Salut";
        TransCoder test = new TransCoder(keyCrypted);
        System.out.println(test.encode(msg));
    }

    @Test
    public void testDecode() {
        String keyCrypted = "6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==";
        String msg = "BYAPASBNBGAPASBGASBNASAFBHBGBNAHAJBNAZAFBLADBNAPASASAJAMAPADBNBJBJBJ";
        TransCoder test = new TransCoder(keyCrypted);
        System.out.println(test.decode(msg));
    }
}