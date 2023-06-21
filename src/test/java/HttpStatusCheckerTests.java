import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class HttpStatusCheckerTests {
    HttpStatusChecker httpStatusChecker;

    @BeforeEach
    public void createAnObject(){
        httpStatusChecker = new HttpStatusChecker();
    }

    @Test
    public void testThatGetStatusImageOn200WorksOk() throws Exception {
        String actual = httpStatusChecker.getStatusImage(200);
        String expected = "https://http.cat/200.jpg";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatGetStatusImageOn404WorksOk() throws Exception {
        String actual = httpStatusChecker.getStatusImage(404);
        String expected = "https://http.cat/404.jpg";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatGetStatusImageOn10000WorksOk(){
        Assertions.assertThrows(Exception.class, () -> httpStatusChecker.getStatusImage(10000));
    }
}
