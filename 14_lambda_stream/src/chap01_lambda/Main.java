package chap01_lambda;

/*
 * 인터페이스 vs 추상 클래스
 * 여러 클래스에게 동일한 기능 명세를 강제하고 싶을 때 인터페이스
 * 공통된 필드, 기본 동작을 공유하면서 일부만 자식이 구현하길 원할 때 추상 클래스
 */

/*
 * Lambda Expression
 * 1. JDK 8부터 도입된 표현식으로 자바의 객체지향 프로그래밍 방식에 함수형 프로그래밍 방식을 접목하는 표현식입니다.
 * 2. 메소드를 이름 없는(익명 함수) 하나의 식으로 간결하게 표현할 수 있습니다.
 * 3. 메소드의 반환 타입도 생략할 수 있습니다.
 * 4. 기본 문법 
 *    (매개변수) -> {본문}
 *    1) 매개변수가 하나라면 괄호() 생략 가능
 *    2) 매개변수의 타입은 생략 가능
 *    3) 본문이 한 줄이면 중괄호{} 생략 가능
 *    4) 본문이 return 한 줄이면 return도 생략 가능
 * 5. 문법 예시
 *    1) int add(int a, int b) {return a + b;}
 *       (a, b) -> a + b;
 *    2) void print(int a) {System.out.println(a);}
 *       a -> System.out.println(a);
 * 6. 함수형 인터페이스와 람다 표현식의 관계
 *    1) 람다 표현식은 반드시 함수형 인터페이스(추상 메소드가 1개인 인터페이스)에서만 사용할 수 있습니다.
 *    2) Comparator, Runnable, java.util.function 패키지의 다양한 인터페이스 등이 여기에 해당합니다.
 */
public class Main {

  public static void testA() {
    
//    -람다 표현식 이전-
//    TestA a = new TestA() {
//      @Override
//      public void method() {
//        System.out.println("TestA");
//      }
//    };
    
    //-람다 표현식 도입-
    TestA a = () -> System.out.println("TestA");
    
    a.method();
    
  }
  
  public static void testB() {
    
//    -람다 표현식 이전-
//    TestB b = new TestB() {
//      @Override
//      public void method(String param) {
//        System.out.println("TestB: " + param);
//      }
//    };
    
    //-람다 표현식 도입-
    TestB b = param -> System.out.println("TestB: " + param);
    
    b.method("Hello World");
    
  }
  
  public static void testC() {

//    -람다 표현식 이전-
//    TestC c = new TestC() {
//      @Override
//      public String method() {
//        return "Hello World";
//      }
//    };
    
    //-람다 표현식 도입-
    TestC c = () -> "Hello World";
    
    String result = c.method();
    System.out.println("TestC: " + result);
    
  }
  
  public static void testD() {
    
//    -람다 표현식 이전-
//    TestD d = new TestD() {
//      @Override
//      public String method(String param1, String param2) {
//        return param1 + " " + param2;
//      }
//    };
    
    //-람다 표현식 도입-
    TestD d = (param1, param2) -> param1 + " " + param2;
    
    String result = d.method("Hello", "World");
    System.out.println("TestD: " + result);
    
  }
  
  public static void main(String[] args) {

    testA();
    testB();
    testC();
    testD();
    
  }

}



