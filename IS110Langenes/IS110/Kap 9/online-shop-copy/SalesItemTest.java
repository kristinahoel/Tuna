

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialPrice()
    {
        SalesItem salesIte1 = new SalesItem("A red mountain bike", 1000);
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void testGetName()
    {
        SalesItem salesIte2 = new SalesItem("rød sykkel", 100);
        assertEquals("rød sykkel", salesIte2.getName());
    }
}


