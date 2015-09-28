package be.philippegevaert.travis.uitl;

public class Calculator {
  public int add(int number1, int number2) {
    return number1 + number2;
  }

  public int deduct(int i, int j) {
    return i - j;
  }

  public int multiply(int i, int j) {
    return i * j;
  }

  public int devide(int i, int j) throws DevideException {
    if (j != 0) {
      return i / j;
    }
    throw new DevideException();
  }
}
