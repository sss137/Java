package chap07_instance_array;

import java.util.List;
import java.util.Map;

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
  
  public void addToCart(Map<String, Object> product) {
    if(cart == null) {
      JOptionPane.showMessageDialog(null, "cart를 먼저 준비하세요.");
      return;
    }
    cart.addProduct(product);
  }
  
  public void removeFromCart(int idx) {
    Map<String, Object> removed = cart.removeProduct(idx);
    if(removed != null) {
      JOptionPane.showMessageDialog(null, removed.get("name") + "제품이 Cart에서 제거되었습니다.");
      return;
    }
  }
  
  public String purchase() {
    if(cart == null) {
      JOptionPane.showMessageDialog(null, "cart가 없어서 구매할 수 없습니다.");
      return null;
    }
    List<Map<String, Object>> products = cart.getProducts();
    int count = products.size();
    if(count == 0) {
      JOptionPane.showMessageDialog(null, "cart에 담긴 Product가 없어서 구매할 수 없습니다.");
      return null;
    }
    String receipt = "구디마트 영수증\n";
    int total = 0;                       
    for(int i = 0; i < count; i++) {        
      Map<String, Object> product = products.get(i);         
      int price = (int)product.get("price");
      total += price;                        
      receipt += product.get("name");          
      receipt += "......";
      receipt += price + "\n";               
      }
    if(total > money) {                      
      JOptionPane.showMessageDialog(null, "돈이 부족해서 구매할 수 없습니다.");
      return null;
    }
    money -= total;                          
    receipt += "구매 총액......" + total + "\n";
    return receipt;
  }
  
}



