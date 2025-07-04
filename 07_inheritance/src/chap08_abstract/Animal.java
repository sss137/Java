package chap08_abstract;

/*
 * 추상 클래스(Abstract Class)
 * 1. 추상 메소드를 1개 이상 보유한 클래스입니다.
 * 2. abstract 키워드를 class 앞에 추가합니다.
 * 3. 특징
 *    1) 추상 클래스를 상속 받은 서브클래스들은 반드시 모든 추상 메소드를 오버라이드 해야 합니다.
 *    2) 추상 클래스는 객체(인스턴스)를 생성할 수 없습니다.
 */
public abstract class Animal {    //일반 필드와 일반 메소드 다 갖을 수 있습니다.

  /*
   * 추상 메소드(Abstract Method)
   * 1. 본문이 없는 메소드입니다.
   * 2. 본문을 나타내는 코드 블록({})을 없애고, abstract 키워드를 추가합니다.
   * 3. 서브클래스 객체들이 호출하기 위해서 존재합니다.
   */
  public abstract void move();
  
}



