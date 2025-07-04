package chap07_java_lang_Object;

import java.util.Objects;

public class Car {

  private String carNo;
  private String model;
  
  public Car(String carNo, String model) {
    super();    //java.lang.Object 클래스의 생성자를 호출합니다. 디폴트 생성자의 호출이므로 생략해도 아무 문제 없습니다.
    this.carNo = carNo;
    this.model = model;
  }
  
  public void carInfo() {
    System.out.println("차량번호: " + carNo);
    System.out.println("차량모델: " + model);
  }

  //equals() 메소드 오버라이드(Car 객체의 비교를 위해 새로 만듭니다.)
  //자바에서 Object 클래스는 모든 클래스의 조상인데, 이 Object.equals()의 기본 구현은 ==와 동일하게 작동합니다.
  
  @Override
  public boolean equals(Object obj) {
    if(this == obj)
      return true;
    if(obj == null)
      return false;
    if(getClass() != obj.getClass())
      return false;
    Car other = (Car) obj;
    return Objects.equals(carNo, other.carNo);
  }
  
  //toString() 메소드 오버라이드(Car 객체의 정보를 출력하기 위해 새로 만듭니다.)
  @Override
  public String toString() {
    return "Car [carNo=" + carNo + ", model=" + model + "]";
  }
  
  
}
