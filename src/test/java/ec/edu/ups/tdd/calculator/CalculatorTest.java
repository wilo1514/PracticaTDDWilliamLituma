package ec.edu.ups.tdd.calculator;

import org.junit.*;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c = null;
    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        c = new Calculator();
        System.out.println("setUp()");
    }
    @Test
    public void given_two_integers_when_addition_then_ok(){
        assertEquals(6,c.addition(4,2));
        System.out.println("Test 1");
    }
    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        assertEquals(2,c.subtraction(4,2));
        System.out.println("Test 2");
    }
    /* treatment Arithmetic exception*/

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception(){
        assertEquals(3,c.division(6,0));
        System.out.println("test 3 " );
    }
    /* treatment timeout error*/
    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_timeout(){
        assertEquals(12,c.multiplication(6,2));
        System.out.println("test 4" );
    }
    @After
    public void TearDown(){
        System.out.println("TearDown");
        c.setAns(0);
    }
    @AfterClass
    public static void TearDownClass(){System.out.println("TearDownClass");}
}