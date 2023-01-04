/**
import org.junit.Test;
        import org.petersix.model.Message;

        import java.io.IOException;
        import java.nio.file.Path;
        import java.nio.file.Paths;

public class MessageTest {
    @Test
    public void msgTestClear() throws IOException {
        String home = System.getProperty("user.dir");
        Path msgClearPath = Paths.get(home,"clearTest.txt");
        Path msgEncodedPath = Paths.get(home,"encodedTest.txt");
        Path msgKeyPath = Paths.get(home,"keyTest.txt");
        Message msgTest = new Message(false,msgClearPath,msgEncodedPath,msgKeyPath);
        msgTest.read();
    }

    @Test
    public void msgTestEncoded() throws IOException {
        String home = System.getProperty("user.dir");
        Path msgClearPath = Paths.get(home,"clearTest2.txt");
        Path msgEncodedPath = Paths.get(home,"encodedTest.txt");
        Path msgKeyPath = Paths.get(home,"keyTest.txt");
        Message msgTest = new Message(true,msgClearPath,msgEncodedPath,msgKeyPath);
        msgTest.read();

    }
}
 **/