import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramTest {
    @Test
    public void testGetMessage() {
        assertEquals("Hello, World!", Program.getMessage());
    }
}