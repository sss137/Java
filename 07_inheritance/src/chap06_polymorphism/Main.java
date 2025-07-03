package chap06_polymorphism;

/*
 * 다형성(Polymorphism)
 * 1. 하나의 객체가 여러 가지 형태를 가질 수 있음을 의미합니다.
 * 2. 자바에서는 슈퍼클래스 타입의 참조변수가 서브클래스의 객체를 참조할 수 있도록 허용함으로써 다형성을 구현합니다.
 * 3. 다형성의 예시
 *    1) 하나의 타입으로 여러 객체를 다루는 경우(up-casting)
 *    2) 동일한 메소드의 호출이 다른 동작을 하는 경우(override)
 */
public class Main {

  public static void main(String[] args) {

    Dog chi = new Chihuahua("치와와");
    Dog hus = new Husky("허스키");
    
    Person per = new Person();
    per.feedFood("개껌", chi);
    per.feedFood("고기", hus);
    
  }

}
