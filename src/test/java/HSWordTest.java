import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class HSWordTest {
    @Test
    public void sampleTests() {
        assertEquals("taxi", HSWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", HSWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", HSWord.high("take me to semynak"));
    }
}
