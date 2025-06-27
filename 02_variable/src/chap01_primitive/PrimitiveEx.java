package chap01_primitive;

public class PrimitiveEx {

  public static void main(String[] args) {
    /*
     * Primitive Type(boolean, byte, short, int, long, float, double, char)
     * 1. 기본 타입을 의미합니다.
     * 2. 8가지 기본 타입이 있습니다.
     * 3. 오직 값만 저장하는 타입입니다.
     * 4. 객체와 구별하기 위한 데이터 타입입니다.
     */
    {
      //boolean
      //논리값(true 또는 false)
      //1bit(Java 명세상)
      boolean a;
      a = true;
      System.out.println(a);
    }
    
    {
      //비트와 바이트
      //1. 비트: 0 또는 1을 저장할 수 있는 최소 저장 단위
      //2. 바이트: 8비트로 구성된 메모리의 최소 저장 단위
      
      //비트에 따른 데이터 표현 개수
      //예시)
      //2비트로 가능한 데이터 조합: 00, 01, 10, 11
      //...
      //N비트로 가능한 데이터 조합: 2의 N제곱
      
      //비트에 따른 데이터 표현 범위
      //8비트로 가능한 데이터 범위: -128 ~ 127
      //N비트로 가능한 데이터 범위: -2의 (N-1)제곱 ~ 2의 (N-1)제곱 -1
    }
    
    {
      //정수 타입
      //1. byte:  1byte(-128 ~ 127)
      //2. short: 2byte(-32768 ~ 32767)
      //3. int:   4byte(대표 정수 타입)
      //4. long:  8byte
      byte a;
      short b;
      int c;
      long d;
      a= Byte.MAX_VALUE; System.out.println(a);
      b = Short.MAX_VALUE; System.out.println(b);
      c = Integer.MAX_VALUE; System.out.println(c);
      d = Long.MAX_VALUE; System.out.println(d);
      
      //long 타입 주의점(int 범위를 벗어나는 값의 리터럴 작성 시 마지막에 l 또는 L을 추가합니다.)
      d = 2147483648L; System.out.println(d);
    }
    
    {
      //실수 타입
      //1. float:  4바이트
      //2. double: 8바이트(대표 실수 타입)
      float a;
      double b;
      
      //float 주의사항(리터럴 작성 시 반드시 마지막에 f 또는 F를 추가합니다.)
      a = 1.5f; System.out.println(a); //float는 사용하지 않습니다.
      b = 2.5; System.out.println(b);
    }
    
    {
      //char
      //문자
      //2바이트(유니코드 문자: 0 ~ 65535)
      char a = 'a';
      System.out.println(a + 1);
    }
    
  }

}
