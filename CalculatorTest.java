package cz.cvut.fel.ts1;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    int a = 5;
    int b = 5;
    int c = 0;
    @BeforeEach
    public void BeforeEach(){
        System.out.println("Test running");
    }
    @AfterEach
    public void AfterEach(){ System.out.println("Test finished"); }
    @Test
    public void addTest(){ Assertions.assertEquals(10, calculator.add(a, b));}
    @Test
    public void subtractTest(){ Assertions.assertEquals(0, calculator.subtract(a, b));}
    @Test
    public void multiplyTest(){ Assertions.assertEquals(25, calculator.multiply(a, b));}
    @Test
    public void divideTest(){ Assertions.assertEquals(1, calculator.divide(a, b));}
    @Test
    public void divideZeroTest(){ Assertions.assertEquals(5, calculator.add(a, c));}
}
