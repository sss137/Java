package chap04_instance_array_try_catch;

import javax.swing.JOptionPane;

public class Customer {
  
  private int money;
  private Cart cart;
  
  public Customer(int money) {
    this.money = money;
  }
  
  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    //마이너스 money는 예외 발생 후 예외 처리
    try {
      if(money < 0) {
        throw new RuntimeException(money + "원은 잘못된 돈입니다.");
      }
      this.money = money;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }
  
  public void addToCart(Product product) {
    //예외 발생 후 예외 처리
    try {
      if(cart == null) {
        throw new RuntimeException("cart를 먼저 준비하세요.");
      }
      cart.addProduct(product);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  public void removeFromCart(int idx) {
    Product removed = cart.removeProduct(idx);
    if(removed != null) {
      JOptionPane.showMessageDialog(null, removed.getName() + "제품이 Cart에서 제거되었습니다.");
      return;
    }
  }
  
  public String purchase() {
    //예외 발생 후 예외 처리
    String receipt = null;        
    try {
      if(cart == null) {
        throw new RuntimeException("cart가 없어서 구매할 수 없습니다.");
      }
      int count = cart.getCount();    //여러번 호출을 막기 위해 변수에 저장
      if(count == 0) {
        throw new RuntimeException("cart에 담긴 Product가 없어서 구매할 수 없습니다.");
      }
      receipt = "구디마트 영수증\n";           
      int total = 0;                           
      Product[] products = cart.getProducts();
      for(int i = 0; i < count; i++) {        
        Product product = products[i];        
        int price = product.getPrice();
        total += price;                       
        receipt += product.getName();         
        receipt += "......";
        receipt += price + "\n";              
      }
      if(total > money) {                  
        receipt = null;
        throw new RuntimeException("돈이 부족해서 구매할 수 없습니다.");
      }
      money -= total;                     
      receipt += "구매 총액......" + total + "\n"; 
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return receipt;
  }
  
}



