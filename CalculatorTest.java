import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void addReturnsSum() {
        assertEquals(5.0, Calculator.add(2.0, 3.0));
    }

    @Test
    public void subtractReturnsDifference() {
        assertEquals(1.0, Calculator.subtract(3.0, 2.0));
    }

    @Test
    public void multiplyReturnsProduct() {
        assertEquals(6.0, Calculator.multiply(2.0, 3.0));
    }

    @Test
    public void divideReturnsQuotient() {
        assertEquals(2.0, Calculator.divide(6.0, 3.0));
    }

    @Test
    public void divideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(1.0, 0.0));
    }
}
