import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import ru.home.calculation.Arithmetics;

/**
 * Created by dima on 15.02.15.
 */
public class TestArithmetics {
    static private Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public final Timeout time = new Timeout(1000);

    @BeforeClass
    /**
     * Invoke before all methods
     */
    static public void runT() {
        a = new Arithmetics();
    }

    /*
        @After - invoke after each method
        @AfterClass - invoke after all method
     */

    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        Assert.assertEquals(res, 10, 0.1);
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        Assert.assertEquals(res, 21, 0.1);
    }

    @Ignore
    @Test
    public void testDeduct() {
        double res = a.deduct(3, 7);
        Assert.assertEquals(res, -4.0, 0.1);
    }

    @Test
    public void testDiv() {
        double res = a.div(10, 5);
        Assert.assertEquals(res, 2.0, 0.1);
    }

//    @Test(expected = ArithmeticException.class)
    @Test
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

//    @Test(timeout = 1000)
    @Test
    public void tetN() {
        // In this case we use @Rule Timeout
        while (true){}
        /*try {
            Thread.sleep(999);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
