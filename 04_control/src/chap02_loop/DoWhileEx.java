package chap02_loop;

public class DoWhileEx {

  public static void main(String[] args) {
    //1 ~ 100 누적하기
    int total = 0;
    int x = 1;
    do {                        //while문 안의 조건이 false라도 무조건 한 번은 실행한다. 
      total += x++;
    } while(x <= 100);
    System.out.println(total);
    
  }

}
