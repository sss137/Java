package chap04_instance_array_try_catch;

import javax.swing.JOptionPane;

public class Cart {
  
  private Product[] products;        //Product 배열 선언(이후에 배열의 생성이 필요합니다.)
  private int count;                //products 배열에 저장된 Product 개수
  private final int LIMIT = 100;    //products 배열의 길이(final: 상수(값을 바꿀 수 없습니다.
//                                                                       반드시 초기화가 필요합니다.
//                                                                       관례상 대문자로 작성합니다.))
  
  public Cart() {
    products = new Product[LIMIT];    //new Cart() 실행 시 products 배열이 생성됩니다.
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
    if(count == 0) {
      throw new RuntimeException("Cart가 비어있습니다.");
    }
    if(idx < 0 || idx >= count) {
      throw new RuntimeException(idx + "는 없는 인덱스입니다.");
    }
    try {
      removed = products[idx];    //삭제된 요소(현재는 삭제될 요소)
      System.arraycopy(products, idx + 1, products, idx, count - idx - 1);    //한 칸 당기고 배열을 그대로 카피
      products[--count] = null;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return removed;                    //삭제된 요소 반환
  }
  
}



