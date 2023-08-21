package AutomatedTesting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest1 {
    @Test
    public void testAddition () {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(15, result);
    }
}
