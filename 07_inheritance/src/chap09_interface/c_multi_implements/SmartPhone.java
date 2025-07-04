package chap09_interface.c_multi_implements;

public class SmartPhone implements Camera, Phone {    //인터페이스는 다중 구현할 수 있습니다.

  @Override
  public void call() {
    System.out.println("통화 기능");
  }

  @Override
  public void picture() {
    System.out.println("카메라 기능");
  }

  
  
}
