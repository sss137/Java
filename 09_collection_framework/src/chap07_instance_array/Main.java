package chap07_instance_array;

import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    
    //Product 진열하기
    Map<String, Object> product1 = Map.of("name", "양파 1.5kg", "price", 3000);
    Map<String, Object> product2 = Map.of("name", "고등어1손", "price", 5000);
    Map<String, Object> product3 = Map.of("name", "한돈앞다리1kg", "price", 15000);
    Map<String, Object> product4 = Map.of("name", "블랙앵거스살치살500g", "price", 20000);
    Map<String, Object> product5 = Map.of("name", "꼬마돈까스", "price", 9000);
    
    //Cart 진열하기
    Cart cart1 = new Cart();
    
    //Customer 입장
    Customer customer = new Customer(100000);
    
    //Customer가 Cart 취득
    customer.setCart(cart1);
    
    //쇼핑
    customer.addToCart(product2); product2 = null;    //product2 = null은 중복 담기 방지
    customer.addToCart(product3); product3 = null;
    customer.addToCart(product4); product4 = null;
    
    customer.removeFromCart(0);
    
    //구매
    String receipt = customer.purchase();
    
    //구매내역 확인
    if(receipt != null) {
    JOptionPane.showMessageDialog(null, receipt);
    JOptionPane.showMessageDialog(null, "남은 돈: " + customer.getMoney());
    }
    
  }

}



