package chap04_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Set<T> 인터페이스
 * 1. 자바 컬렉션 프레임워크(JCF)에서 중복을 허용하지 않는 데이터 집합을 정의하는 인터페이스입니다.
 * 2. 수학의 집합과 유사하게 동일한 요소를 2번 이상 저장할 수 없고, 요소들의 저장 순서도 없습니다.(인덱스가 없습니다.)
 * 3. 주요 구현클래스
 *       컬렉션 종류     정렬 여부   순서 유지        중복 판단 기준(모두 중복 x)   특징
 *    --------------------------------------------------------------------------------------------------
 *    1) HashSet         없음        유지 안 됨       hashCode() + equals()         가장 빠름
 *    2) TreeSet         자동 정렬   정렬 순서 유지   compareTo() 또는 Comparator   느리지만 정렬 기능
 *    3) LinkedHashSet   없음        삽입 순서 유지   hashCode() + equals()         순서 필요할 때 사용
 */

/*
 * 해시(Hash)  <<  방법 혹은 값
 * 1. 해시는 임의의 데이터를 고정된 크기의 값으로 변환하는 방법(해시 함수) 또는 그 결과값(해시값) 자체를 의미합니다.
 * 2. 해시 함수를 통해서 입력값에 따라 서로 다른 결과값(해시값)이 나오도록 설계되어 있습니다.
 * 3. 데이터 검색, 무결성 검사, 암호화 등 다양한 분야에서 활용합니다.
 * 
 * 해시테이블(Hash Table)
 * 1. 해시 함수를 이용해 데이터를 저장하고 검색하는 자료구조(Data Structure)입니다.
 * 2. 데이터를 키(Key)-값(Value) 쌍으로 저장하며 키(Key)를 해시 함수에 넣어 얻는 해시값을 배열의 인덱스로 사용하고 값(Value)을 저장합니다.
 * 3. 빠른 검색, 삽입, 수정이 가능합니다.
 * 
 * 해시와 해시 함수 이해하기
 * 예시) 뽀로로, 루피, 에디, 포, 크롱 데이터(키(Key)-값(Value)) 저장하기
 * - Key  : 이름
 * - Value: 각 캐릭터의 자세한 설명을 객체로 저장
 * - 해시 함수(Key를 이용해서 어떤 값을 반환하는 함수)
 *    -> 이름의 획 수를 해시값으로 사용하자.
 *    뽀로로의 해시값 24 - 인덱스 24에 뽀로로 객체를 저장
 *    루피의 해시값 12 - 인덱스 12에 루피 객체를 저장
 *    에디의 해시값 8 - 인덱스 8에 에디 객체를 저장
 *    포의 해시값 6 - 인덱스 6에 포 객체를 저장
 *    크롱의 해시값 12 - 인덱스 12에 크롱 객체를 저장(해시값 충돌: 체이닝 방식(연결 리스트) 등으로 기존 루피 객체에 이어서 크롱 객체를 저장)
 */
public class Main {
  
  public static void hashSet() {
    
    Set<String> hobbies = new HashSet<String>();
    
    hobbies.add("여행");
    hobbies.add("게임");
    hobbies.add("오티티");
    hobbies.add("게임");            //중복 저장 허용 x
    hobbies.add("운동");
    System.out.println(hobbies);    //요소들의 저장 순서 보장 x
    
    //List 인터페이스와 동일하게 Collection 인터페이스를 구현했으나 인덱스 관련 사용은 불가합니다.
    //hobbies.get(0), hobbies.remove(0), 일반 for문(향상 for문은 가능) 등 사용 불가
    
  }
  
  public static void unique() {
    
    Set<Person> people = new HashSet<Person>();
    
    people.add(new Person("뽀로로", 20));
    people.add(new Person("뽀로로", 20));
    people.add(new Person("뽀로로", 20));
    
    System.out.println(people);
    
  }
  
  public static void treeSet() {
    
    //TreeSet: 정렬이 유지되는 Set
    //Set 인터페이스의 하위 인터페이스 SortedSet 인터페이스를 타입으로 사용
    SortedSet<String> hobbies = new TreeSet<>();    //기본 생성 방식은 오름 차순 정렬을 지원
    hobbies.add("여행");
    hobbies.add("게임");
    hobbies.add("오티티");
    hobbies.add("운동");
    hobbies.add("맛집탐방");
    hobbies.add("낚시");
    hobbies.add("독서");
    System.out.println(hobbies);
    
    String first = hobbies.first();    //가장 작은 요소
    String last = hobbies.last();      //가장 큰 요소
    System.out.println(first+ ", " + last);
    
    String from = "여행";
    String to = "운동";
    System.out.println(hobbies.subSet(from, to));
    
    hobbies = new TreeSet<>(Comparator.reverseOrder());    //내림차순 정렬되는 hobbies 다시 생성
    hobbies.add("여행");
    hobbies.add("게임");
    hobbies.add("오티티");
    hobbies.add("운동");
    hobbies.add("맛집탐방");
    hobbies.add("낚시");
    hobbies.add("독서");
    System.out.println(hobbies);
    
  }
  
  public static void linkedHashSet() {
    
    //LinkedHashSet: 저장된 순서를 유지하는 Set
    Set<String> hobbies = new LinkedHashSet<>();
    hobbies.add("여행");
    hobbies.add("게임");
    hobbies.add("오티티");
    hobbies.add("게임");            //중복 저장 허용 x
    hobbies.add("운동");
    System.out.println(hobbies);    //요소들의 저장 순서 보장 o
    
  }

  public static void main(String[] args) {
    
    String a = "Hello";
    String b = "Hello";
    String c = new String("Hello");
    
    System.out.println(a.hashCode());    
    System.out.println(b.hashCode());
    System.out.println(c.hashCode());
//    hashCode(): 객체의 내용을 바탕으로 계산된 숫자 값(기본적으로 내용이 같으면 같음)
    
//    hashSet();
//    unique();
    treeSet();
//    linkedHashSet();
  }
  
}



