package chap02_generic;

public class Main {

  public static void main(String[] args) {
   
   //Integer 저장용 Container
    Container<Integer> container1 = new Container<Integer>();
    container1.setItem(10);
    System.out.println(container1.getItem());
    
    //Double 저장용 Container
    Container<Double> container2 = new Container<Double>();
    container2.setItem(10.0);
    System.out.println(container2.getItem());
    
    //String 저장용 Container
    Container<String> container3 = new Container<String>();
    container3.setItem("sss");
    System.out.println(container3.getItem());
   
    /*
     * 생성자 호출 시 타입 파라미터 전달은 생략할 수 있습니다.
     * Container<Integer> container1 = new Container<>();
     * Container<Double> container2 = new Container<>();
     * Container<String> container3 = new Container<>();
     */
    
  }
  
}
