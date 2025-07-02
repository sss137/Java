package chap09_instance_array;

import javax.swing.JOptionPane;

public class Cart {
  
  //필드
  private Product[] products;        //Product 배열 선언(이후에 배열의 생성이 필요합니다.)
  private int count;                //products 배열에 저장된 Product 개수
  private final int LIMIT = 100;    //products 배열의 길이(final: 상수(값을 바꿀 수 없습니다.
//                                                                       반드시 초기화가 필요합니다.
//                                                                       관례상 대문자로 작성합니다.))
  
  //생성자
  public Cart() {
    products = new Product[LIMIT];    //new Cart() 실행 시 products 배열이 생성됩니다.
  }

  //메소드
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
    if(product == null) {
      JOptionPane.showMessageDialog(null, "전달된 Product이 없습니다.");
      return;
    }
    if(count == LIMIT) {
      JOptionPane.showMessageDialog(null, "더 이상 Cart에 담을 수 없습니다.");
      return;
    }
    products[count++] = product;
  }

  public Product removeProduct(int idx) {
    if(count == 0) {
      JOptionPane.showMessageDialog(null, "카트가 비어있습니다.");
      return null;
    }
    if(idx < 0 || idx >= count) {
      JOptionPane.showMessageDialog(null, idx + "는 없는 인덱스입니다.");
      return null;
    }
    Product removed = products[idx];    //삭제된 요소(현재는 삭제될 요소)
    System.arraycopy(products, idx + 1, products, idx, count - idx - 1);    //한 칸 당기고 배열을 그대로 카피
    products[--count] = null;
    return removed;                    //삭제된 요소 반환
    
  }
  
}



