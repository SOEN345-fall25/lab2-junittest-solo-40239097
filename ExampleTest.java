import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {
    @Test
    public void testFunctionA_PositiveY() {
        Example ex = new Example(5, 3);
        int result = ex.Function_A(10); // y > 0 branch
        assertEquals(15, result);
    }

    @Test
    public void testFunctionA_NonPositiveY() {
        Example ex = new Example(5, 3);
        int result = ex.Function_A(-2); // y <= 0 branch
        assertEquals(-7, result);
    }

    @Test
    public void testFunctionB_XLessThan6() {
        Example ex = new Example(5, 3);
        int result = ex.Function_B(2); // x < 6 branch
        assertEquals(5, result);
    }

    @Test
    public void testFunctionB_XGreaterOrEqual6() {
        Example ex = new Example(5, 3);
        int result = ex.Function_B(8); // x >= 6 branch
        assertEquals(5, result);
    }
}
