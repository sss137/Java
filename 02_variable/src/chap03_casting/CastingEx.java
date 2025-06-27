package chap03_casting;

public class CastingEx {

  public static void main(String[] args) {
    /*
     * Casting
     * 1. 데이터 타입 변환의 한 종류입니다.
     * 2. 개발자가 직접 변환할 타입을 명시하는 명시적 변환 과정을 의미합니다.
     * 3. 타입 변환 시 데이터 손실이 발생할 수 있습니다.
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