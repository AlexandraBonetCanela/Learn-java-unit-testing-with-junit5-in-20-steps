import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StringTest {

    @Test
    void test(){
        fail("Not yet implemented");
    }

    @Test
    void stringPassTest(){
        int actualLength = "ABCD".length();
        int expectedLength = 4;
        assertEquals(actualLength,expectedLength);
    }

    @Test
    void stringFailsTest(){
        int actualLength = "ABCDE".length();
        int expectedLength = 4;
        assertEquals(actualLength,expectedLength);
    }
}
