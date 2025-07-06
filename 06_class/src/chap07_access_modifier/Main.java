package chap07_access_modifier;

public class Main {

  public static void main(String[] args) {
    
    Car car1 = new Car();
    car1.printInfo();
    
    Car car2 = new Car("X6", 12000, new Brand("BMW", "Germany"));
    car2.printInfo();
    
    Car car3 = new Car("G80", 8000, "Genesis", "Korea");
    car3.printInfo();
    
    //Getter는 필드값을 확인할 때 사용합니다.
    System.out.println(car1.getModel());
    System.out.println(car1.getPrice());
    System.out.println(car1.getBrand().getName());
    System.out.println(car1.getBrand().getNation());
    
    //Setter는 필드값을 수정할 때 사용합니다.
    car3.setModel("저렴한 차");
    car3.setPrice(100);
    car3.setBrand(new Brand("차 상점", "한국"));
    car3.printInfo();
    
    car2.setModel("귀여운 차");
    car2.setPrice(200);
    car2.getBrand().setName("카와이");
    car2.getBrand().setNation("일본");
    car2.printInfo();
  }

}



