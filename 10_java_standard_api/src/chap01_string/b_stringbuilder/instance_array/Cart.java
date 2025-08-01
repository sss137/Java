package chap01_string.b_stringbuilder.instance_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Cart {
  
  private List<Map<String, Object>> products;        
  
  public Cart() {
    products = new ArrayList<Map<String,Object>>();    
  }

  public List<Map<String, Object>> getProducts() {
    return products;
  }

  public void setProducts(List<Map<String, Object>> products) {
    this.products = products;
  }

  public void addProduct(Map<String, Object> product) {
    if(product == null) {
      JOptionPane.showMessageDialog(null, "전달된 Product이 없습니다.");
      return;
    }
    products.add(product);
  }

  public Map<String, Object> removeProduct(int idx) {
    int count = products.size();
    if(count == 0) {
      JOptionPane.showMessageDialog(null, "카트가 비어있습니다.");
      return null;
    }
    if(idx < 0 || idx >= count) {
      JOptionPane.showMessageDialog(null, idx + "는 없는 인덱스입니다.");
      return null;
    }
    
    return products.remove(idx);
  }
  
}



