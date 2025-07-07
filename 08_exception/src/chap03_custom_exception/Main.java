package chap03_custom_exception;

public class Main {

  public static void customException() throws MyException {  //customException() 메소드를 호출한 곳으로 예외 던지기
    
    //MyException 발생 후 예외 위임
    throw new MyException("예외메시지입니다.");
    
  }

  public static void main(String[] args) {  
    
    try {
      customException();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

}
  
//  public static void main(String[] args) throws MyException {  //main() 메소드를 호출한 곳으로 예외 던지기
//                                                               //main()은 JVM이 호출하니까 예외 처리 코드 생략(권장X)
//                                                               //즉 JVM에게 예외 위임
//    customException();
//    
//  }

}
