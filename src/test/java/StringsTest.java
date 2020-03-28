import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class StringsTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", Strings.whoLikesIt());
        assertEquals("Peter likes this", Strings.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Strings.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Strings.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Strings.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}