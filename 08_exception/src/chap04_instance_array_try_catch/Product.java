package chap04_instance_array_try_catch;

public class Product {
  
  private String name;
  private int price;
  
  public Product() {}
  
  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getPrice() {
    return price;
  }
  
  public void setPrice(int price) {
    //가격을 음수로 설정하면 예외가 발생합니다. 예외처리 해보기.
    try {
      if(price < 0) {
        throw new RuntimeException(price + "원은 잘못된 가격입니다.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    this.price = price;
 }
  
}
