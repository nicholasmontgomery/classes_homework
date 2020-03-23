import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calculator.subtract(6,2));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calculator.multiply(5,4));
    }

    @Test
    public void testDivide() {
        assertEquals(10.00, calculator.divide(100.00,10.00), 0.0);
    }
}
