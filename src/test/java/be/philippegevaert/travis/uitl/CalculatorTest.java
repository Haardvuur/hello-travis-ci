package be.philippegevaert.travis.uitl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  private Calculator calculator;

  @Before
  public void before() {
    calculator = new Calculator();
  }

  @Test
  public final void testAdd() {
    int result = calculator.add(1, 1);
    assertEquals(2, result);
  }

}
