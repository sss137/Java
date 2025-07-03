package chap06_polymorphism;

public class Person {

  public void feedFood(String food, Dog dog) {  //Dog dog 매개변수가 new Chihuahua() 또는 new Husky()를 참조할 수 있습니다.
                                                 //이것이 다형성입니다.
    System.out.println(dog.getName() + "에게 " + food + "을(를) 줍니다");
    
  }
  
}
