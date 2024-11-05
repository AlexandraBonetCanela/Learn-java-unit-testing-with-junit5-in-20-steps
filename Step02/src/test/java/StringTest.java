import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void toUpperCasePassTest(){
        String str = "abcd";
        String result = str.toUpperCase();

        assertNotNull(result);
        // assertNull(result);
        assertEquals("ABCD",result);
    }

    //to assert booleans
    @Test
    void containsPass(){
        String str = "abcdefgh";
        boolean result = str.contains("ijk");

        //assertEquals(false, result);
        assertFalse(result);
    }
}
