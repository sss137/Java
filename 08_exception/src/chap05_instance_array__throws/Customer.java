package chap05_instance_array__throws;

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
    this.money = money;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }
  
  public void addToCart(Product product) {    //throws RuntimeException 생략
    //예외 발생 후 예외 회피
    if(cart == null) {
      throw new RuntimeException("cart를 먼저 준비하세요.");
    }
    cart.addProduct(product);    //Cart의 addProduct()이 던진 예외를 다시 회피
  }
  
  public void removeFromCart(int idx) {    //throws RuntimeException 생략
    Product removed = cart.removeProduct(idx);    //Cart의 removeProduct()이 던진 예외를 다시 회피
    if(removed != null) {
      JOptionPane.showMessageDialog(null, removed.getName() + "제품이 Cart에서 제거되었습니다.");
      return;
    }
  }
  
  public String purchase() {    //throws RuntimeException 생략
    //예외 발생 후 예외 회피
    if(cart == null) {
      throw new RuntimeException("cart가 없어서 구매할 수 없습니다.");
    }
    int count = cart.getCount();   
    if(count == 0) {
      throw new RuntimeException("cart에 담긴 Product가 없어서 구매할 수 없습니다.");
    }
    String receipt = "구디마트 영수증\n";  
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
      throw new RuntimeException("돈이 부족해서 구매할 수 없습니다.");
    }
    money -= total;                
    receipt += "구매 총액......" + total + "\n";
    return receipt;
  }
  
}



