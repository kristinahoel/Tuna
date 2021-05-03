

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestableClassTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestableClassTest
{
    /**
     * Default constructor for test class TestableClassTest
     */
    public TestableClassTest()
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
    public void AddReturnsCorrectSum()
    {
        TestableClass unitUnderTest = new TestableClass(); //arrange
        var result =unitUnderTest.Add(100, 1000); //act
        double expected = 10;
        assertEquals(expected, result); //assert
    }
}

