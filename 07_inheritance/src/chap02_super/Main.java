package chap02_super;

/*
 * super    << 부모 객체의 참조값
 * 1. 상속 관계에 놓인 클래스 중 자식클래스(서브클래스)가 부모클래스(슈퍼클래스)를 지칭하는 키워드입니다.
 * 2. super() 문법은 슈퍼클래스의 생성자를 호출하는 문법입니다.
 * 3. super.멤버 문법은 슈퍼클래스의 멤버에 접근할 때 사용하는 문법입니다.
 */

public class Main {

  public static void main(String[] args) {
    
    //Developer
    Developer dp = new Developer("뽀로로", new String[] {"Java", "Python", "C#", "Flutter", "Ruby"});
    dp.printInfo();
    
  }

}
