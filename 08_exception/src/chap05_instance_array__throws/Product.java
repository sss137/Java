package chap05_instance_array__throws;

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
  
  public void setPrice(int price) {    //throws RuntimeException 생략
    //예외 발생 후 예외 회피(예외 회피 시 null 반환)
    if(price < 0) {
      throw new RuntimeException(price + "원은 잘못된 가격입니다.");
    }
    this.price = price;
  }
  
}
