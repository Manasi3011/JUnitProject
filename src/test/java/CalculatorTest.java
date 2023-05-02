import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+2");
        assertEquals(6, sum);
        int sub = calculator.evaluate1("5-2-1");
        assertEquals(2,sub);
    }
}
