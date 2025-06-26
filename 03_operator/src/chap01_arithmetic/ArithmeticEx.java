package chap01_arithmetic;

public class ArithmeticEx {

  public static void main(String[] args) {
    //산술 연산
    {
    //정수
    int a = 5;
    int b = 2;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);  //나눈 몫
    System.out.println(a % b);
    }
    
    {
    //실수
    double a = 5;
    double b = 2;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);  //나눈 값
    System.out.println(a % b);
    }
    
    {
    //증가
    int a = 10;
    System.out.println(a++);  //후위 연산
    System.out.println(++a);  //전위 연산
    }
    
    {
    //감소
    int a = 10;
    System.out.println(a--);  //후위 연산
    System.out.println(--a);  //전위 연산
    }
  }

}
