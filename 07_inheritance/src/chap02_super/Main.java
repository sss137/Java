package chap02_super;

/*
 * super    << 부모 객체의 참조값
 * 1. 상속 관계에 놓인 클래스 중 자식클래스(서브클래스)가 부모클래스(슈퍼클래스)를 지칭하는 키워드입니다.
 * 2. super() 문법은 슈퍼클래스의 생성자를 호출하는 문법입니다.
 * 3. super.멤버 문법은 슈퍼클래스의 멤버에 접근할 때 사용하는 문법입니다.
 */

/*
 * 메소드 오버라이드
 * 1. 슈퍼클래스의 메소드를 서브클래스가 다시 만드는 것을 의미합니다.
 * 2. 완전히 동일한 원형을 가지도록 다시 만들어야 합니다.(반환타입, 메소드명, 매개변수가 모두 동일해야 합니다.)
 * 3. 오버라이드한 메소드는 @Override 어노테이션을 추가하는 것이 권장입니다.
 * 4. 접근제어자의 경우 더 넓은 범위의 권한으로 바꾸는 것은 허용됩니다.
 *    예시) 부모-protected, 자식-public
 */
public class Main {

  public static void main(String[] args) {
    
    //Developer
    Developer dp = new Developer("뽀로로", new String[] {"Java", "Python", "C#", "Flutter", "Ruby"});
    dp.printInfo();
    
  }

}
