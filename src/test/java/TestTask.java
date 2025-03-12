import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for simple App.
 */
public class TestTask {
    @ParameterizedTest
    @CsvSource({
            "2, 1, 2",
            "2, 100, 100",
            "300, 300, 300",
            "-1, 2, 2",
            "-2, -1, -1",
            "0, -1, 0"
    })
    void testFindMaxElementSimpleOperation(int elem1, int elem2, int max) {
        Assertions.assertEquals(max, App.findMaxElement(elem1, elem2), String.format("Max element should be %d!%n", max));
    }
}
