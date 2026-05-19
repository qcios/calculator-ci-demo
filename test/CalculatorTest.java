import org.junit.Test;
import static org.junit.Assert.*;

// 单元测试
public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSub() {
        assertEquals(3, calc.sub(5, 2));
    }

    @Test
    public void testMul() {
        assertEquals(12, calc.mul(3, 4));
    }

    @Test
    public void testDiv() {
        assertEquals(5.0, calc.div(10, 2), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivZero() {
        calc.div(5, 0);
    }
}