package chap03_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Collection 인터페이스
 * 1. 자바 컬렉션 프레임워크(JCF)의 핵심 인터페이스입니다.
 * 2. 데이터의 집합(여러 데이터)을 다루는 기본 동작을 제공합니다.
 * 3. Iterable 인터페이스의 하위 인터페이스로 for-each와 같은 반복문에서 활용할 수 있습니다.
 * 4. List, Set, Queue 인터페이스의 상위 인터페이스로 해당 인터페이스들의 공통 동작(추가, 삭제 등)을 추상화합니다. 
 * 5. 제네릭(Generic)을 지원하여 타입 안정성을 보장합니다.(잘못된 타입의 값이 전달되면 컴파일 오류 발생)
 * 6. 주요 메소드
 *    1) int size(): 저장된 요소의 개수 반환
 *    2) boolean isEmpty(): 컬렉션이 비어 있으면 true 반환
 *    3) boolean contains(Object o): 전달된 객체가 컬렉션에 포함되어 있으면 true 반환
 *    4) boolean add(E e): 전달된 객체 저장, 성공하면 true 반환
 *    5) boolean remove(Object o): 전달된 객체 삭제, 성공하면 true 반환
 */

/*
 * List 인터페이스
 * 1. Collection 인터페이스의 하위 인터페이스입니다.
 * 2. 객체들을 저장할 때 저장된 순서를 유지합니다.(인덱스를 사용합니다.)
 * 3. 중복된 데이터의 저장이 가능합니다.
 * 4. 주요 구현클래스
 *    1) ArrayList : 배열처럼 연속된 공간을 사용하는 리스트. 강점: 순회가 빠르다, 단점: 추가/삭제가 느리다.
 *    2) LinkedList: 서로 다른 공간을 참조로 연결해서 사용하는 리스트. 강점: 추가/삭제가 빠르다, 단점: 순회가 느리다.
 *    3) Vector    : 사용 x, 컬렉션 프레임워크 이전의 클래스. 기존 메소드와 컬렉션 프레임워크 메소드가 섞여 있습니다.
 */
public class Main {

  public static void mutable() {
    
    //mutable: 저장된 요소의 개수를 변경할 수 있는 리스트(크기는 자동 변경)
    //참조 변수 타입은 List<String>이고, 실제 객체 타입은 ArrayList<String>입니다.
    List<String> seasons = new ArrayList<String>();    //참고: 디폴트 크기는 10입니다.
    seasons.add("spring");    //순서대로 저장
    seasons.add("summer");
    seasons.add("autumn");
    seasons.add("winter");
    System.out.println(seasons.size());    //크기 확인
    System.out.println(seasons.get(2));    //요소 확인
    
  }
  
  public static void immutable() {
    
    //immutable: 저장된 요소의 개수를 변경할 수 없는 리스트
    List<String> seasons = Arrays.asList("봄", "여름", "가을", "겨울");
    
//    seasons.add("aespa");    //요소 추가(실패)
//    seasons.remove(0);       //인덱스 0 요소 삭제(실패)
    seasons.set(1, "봄");    //인덱스 1 요소 수정(성공)
    System.out.println(seasons);
    
  }
  
  public static void traversal() {
    
    List<String> seasons = Arrays.asList("봄", "여름", "가을", "겨울");
    
    //일반 for문: size() 메소드 호출의 반복을 제거하기 위해서 초기화 영역에서 한 번만 호출합니다.
    for(int i = 0, length = seasons.size(); i < length; i++) {
      System.out.println(seasons.get(i));
    }
    
    //향상 for문
    for(String season : seasons) {
      System.out.println(season);
    }
    
  }
  
  public static void sort() {
    
    /*
     * Comparable 인터페이스를 이용한 List 정렬하기
     * 1. 오름차순 정렬
     *    Collections.sort(List<Comparable>)
     * 2. 내림차순 정렬
     *    Collections.sort(List<Comparable>, Collections.reverseOrder())
     * 3. List 정렬을 위해서는 Comparable 인터페이스를 구현한 객체를 요소로 저장해야 합니다.
     *    예시) List<String>, List<Integer>, List<Double> 등...
     */

    //String 리스트(Comparable 인터페이스의 구현클래스)
    List<String> list1 = new ArrayList<String>();
    list1.add("c"); list1.add("d"); list1.add("b"); list1.add("a");
    Collections.sort(list1);
    System.out.println(list1);
    Collections.sort(list1, Collections.reverseOrder());
    System.out.println(list1);
    
    //Data 리스트(Comparable 인터페이스의 구현클래스)
    List<Data> list2 = new ArrayList<Data>();
    list2.add(new Data(30)); list2.add(new Data(10)); list2.add(new Data(40)); list2.add(new Data(20));
    Collections.sort(list2);
    System.out.println(list2);
    Collections.sort(list2, Collections.reverseOrder());
    System.out.println(list2);

    /*
     * Comparator<T> 인터페이스
     * 1. Functional Interface입니다.(추상 메소드가 1개입니다.)
     * 2. 정렬 방식을 동적으로 설정할 때 사용합니다.
     * 3. Comparator 인터페이스를 이용하면 Comparable 인터페이스를 구현하지 않은 클래스의 객체도 정렬할 수 있습니다.
     * 4. 추상 메소드
     *    1) int compareTo(T t1, T t2);
     *    2) 결과가 음수이면 t1을 t2 앞에 두고, 양수이면 t1을 t2 뒤에 둡니다.
     */
    
    //Person 리스트(일반 클래스)
    List<Person> team = new ArrayList<Person>();
    team.add(new Person("뽀로로", 10));
    team.add(new Person("루피", 20));
    team.add(new Person("에디", 30));
    
    //Comparator 인터페이스를 이용해 정렬 방식을 동적으로 설정
    Collections.sort(team, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
       //나이순으로 정렬해 보자. 
        return o1.getAge() - o2.getAge();    //결과가 음수이면 o1이 앞으로, 양수이면 o1이 뒤로 갑니다.
      };
    });
    System.out.println(team);
    
 // Comparator 인터페이스를 이용해 정렬 방식을 동적으로 설정 - 2
    Collections.sort(team, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        // 이름순으로 정렬해 보자.
        // String은 Comparable 인터페이스의 구현체이므로 compareTo() 메소드를 사용할 수 있습니다.
        return o1.getName().compareTo(o2.getName());
      }
    });
    System.out.println(team);
    
  }
  
  public static void main(String[] args) {
    
//    mutable();
//    immutable();
//    traversal();
    sort();
    
  }

}



