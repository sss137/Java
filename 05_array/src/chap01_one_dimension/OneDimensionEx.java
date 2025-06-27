package chap01_one_dimension;

import java.util.Arrays;

public class OneDimensionEx {

  public static void main(String[] args) {
    //배열 선언
    String[] blackPink;   //스택 영역에 참조 변수 blackPink가 생성됩니다.
    
    //배열 생성
    blackPink = new String[4];    //힙 영역에 String 저장이 가능한 연속된 4개 메모리 공간이 생성됩니다.
                                  //그 중 첫 번째 공간의 참조값을 참조변수 blackPink에 저장합니다.
                                  //힙 영역에 생성된 4개 메모리 공간은 늘이거나 줄일 수 없습니다.
    
    //배열 요소 사용(배열명 뒤에 대괄호 붙이고 인덱스 작성)
    blackPink[0] = "제니";
    blackPink[1] = "로제";
    blackPink[2] = "지수";
    blackPink[3] = "리사";
    
    //배열 출력하기
    System.out.println(Arrays.toString(blackPink));
    
    //배열 초기화(배열 선언 + 배열 생성 + 배열 요소에 값 저장)
    //배열 초기화 1(배열 선언과 초기화를 동시에)
    String[] frontEnd = {"HTML", "CSS", "JAVASCRIPT", "REACT"};
    System.out.println(Arrays.toString(frontEnd));
    
    //배열 초기화 2(배열 선언과 초기화를 두 개의 코드로 분리)
    String[] backEnd;
    backEnd = new String[] {"MYSQL", "JAVA", "JSP/SERVLET", "SPRING"};
    System.out.println(Arrays.toString(backEnd));
    
//    활용)
//    함수 AAA(String[] args) {...}
//    호출 AAA({...})                 << 불가능
//         AAA(new String[] {...})    << 가능
  }

}