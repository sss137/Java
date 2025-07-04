package chap09_interface.b_extends;

public class Computer implements Computable {

  @Override
  public void powerOn() {
    System.out.println("Power Button press");
  }

  @Override
  public void powerOff() {
    System.out.println("System Terminate!");
  }

  @Override
  public int add(int a, int b) {
    return a + b;
  }

  @Override
  public int sub(int a, int b) {
    return a - b;
  }

  @Override
  public int mul(int a, int b) {
    return a * b;
  }

  @Override
  public int div(int a, int b) {
    return a / b;
  }

  @Override
  public int mod(int a, int b) {
    return a % b;
  }
  

}
