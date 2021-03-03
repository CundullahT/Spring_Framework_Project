import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCase1(){
        assertEquals(20, 20);
    }

    @Test
    void testCase2(){
        fail("Not implemented yet.");
    }

    @Test
    void add() {
        int actual = Calculator.add(2, 3);
        assertEquals(5, actual);
    }

}
