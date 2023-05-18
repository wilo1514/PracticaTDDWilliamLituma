package ec.edu.ups.tdd.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private static java.util.Arrays Arrays;
    private int a,b,expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> Parameters(){
        return java.util.Arrays.asList(new Object[][]{
                {2,4,6},{1,8,9},{20,4,24},{7,5,12}
        });
    }

    public CalculatorParametersTest(int a, int b, int expected){
        this.a = a;
        this.b = b;
        this.expected = expected;

    }

    @Test
    public void given_two_integers_when_addition_then_ok(){
        Calculator c = new Calculator();
        int actual = c.addition(a,b);
        assertEquals(expected,actual);
    }
}