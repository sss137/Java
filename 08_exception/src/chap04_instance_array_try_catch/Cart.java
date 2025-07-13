package chap04_instance_array_try_catch;

import javax.swing.JOptionPane;

public class Cart {
  
  private Product[] products;      
  private int count;               
  private final int LIMIT = 100;   
  
  public Cart() {
    products = new Product[LIMIT];  
  }

  public Product[] getProducts() {
    return products;
  }

  public void setProducts(Product[] products) {
    this.products = products;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
  
  public void addProduct(Product product) {
    //예외 발생 후 예외 처리하기
    if(product == null) {
      throw new RuntimeException("전달된 Product가 없습니다.");
    }
    if(count == LIMIT) {
      throw new RuntimeException("더 이상 Cart에 담을 수 없습니다.");
    }
    try {
      products[count++] = product;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public Product removeProduct(int idx) {
    //예외 발생 후 예외 처리하기
    Product removed = null;
    try {
      if(count == 0) {
        throw new RuntimeException("Cart가 비어있습니다.");
      }
      if(idx < 0 || idx >= count) {
        throw new RuntimeException(idx + "는 없는 인덱스입니다.");
      }
      removed = products[idx];   
      System.arraycopy(products, idx + 1, products, idx, count - idx - 1);   
      products[--count] = null;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return removed;                 
  }
  
}



