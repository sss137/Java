package chap08_abstract;

public class Main {

  public static void main(String[] args) {

    Animal ani;
    
    //ani = new Animal();    << 추상 클래스 객체는 생성할 수 없습니다.
    
    ani = new Lion();   ani.move();    //호출할 땐 Animal 타입이지만 실행은 Lion 타입이 됨
    ani = new Shark();  ani.move();
    ani = new Eagle();  ani.move();
    
  }

}
