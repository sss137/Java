package chap03_casting;

public class CastingEx {

  public static void main(String[] args) {
    /*
     * Casting
     * 1. 데이터 타입 변환의 한 종류입니다.
     * 2. 개발자가 직접 변환할 타입을 명시하는 명시적 변환 과정을 의미합니다.
     * 3. ★큰 데이터 타입을 작은 데이터 타입으로 직접 변환하는 과정을 의미합니다.(크기가 아닌 데이터 표현 범위가 기준)
     *    but, int a = 3; int b = 2; double result2 = (double) a / b; 
     *    이런식으로 손실 방지를 위해 데이터 범위와 상관 없이 사용 되는 경우도 많음
     *    원래는 int score = 3; double result = score; 이렇게 사용해도 3.0이 저장 되면서 전혀 문제 없음
     * 4. 타입 변환 시 데이터 손실이 발생할 수 있습니다.
     */
    
    //int -> byte 변환
    int i = 256;       //             이진값(비트값): 1 0 0 0 0 0 0 0 0
    byte b = (byte)i; //Casting      이진값(비트값):    0 0 0 0 0 0 0 0
    System.out.println(b);
    
    //double -> long 변환
    double d = 1.9;
    long l = (long)d; //Casting(실수 -> 정수 변환 시 소수 아래는 모두 손실)
    System.out.println(l);
    
    //int -> char 변환
    int iNum = 48;
    char ch = (char)iNum; //Casting(정수 -> 문자 변환 시 정수를 코드값으로 가지는 문자로 변환)
    System.out.println(iNum);
    System.out.println(ch);       //32=' (스페이스)' 48='0', 65='A', 97='a'
  }

}