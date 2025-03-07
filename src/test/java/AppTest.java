import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    void testAssertEquals() {
        int a = 0;
        int b = 1;
        int max = 2;
        int actual = App.maxNumber(a, b, max);
        assertEquals(max, actual, String.format("%d should be max, but result is '%d'", max, actual));
    }
}
