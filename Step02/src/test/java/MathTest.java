import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    @Test
    public void maxPassTest() {
        int actualMax = Math.max(3, 10);
        int expectedMax = 10;

        assertEquals(actualMax, expectedMax);
    }

    @Test
    public void maxFailsTest(){
        int actualMax = Math.max(3, 10);
        int expectedMax = 3;

        assertEquals(actualMax, expectedMax);
    }

    @Test
    public void minPassTest() {
        int actualMin = Math.min(3, 10);
        int expectedMin = 3;

        assertEquals(actualMin, expectedMin);
    }

    @Test
    public void minFailsTest(){
        int actualMin = Math.min(3, 10);
        int expectedMin = 10;

        assertEquals(actualMin, expectedMin);
    }
}
