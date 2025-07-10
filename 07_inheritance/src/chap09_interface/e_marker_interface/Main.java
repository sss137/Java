package chap09_interface.e_marker_interface;

public class Main {

  public static void main(String[] args) {

    Person p = new Person();
    
    Hamburger h = new Hamburger();
    Sashimi s = new Sashimi();
    BloodCakeSoup b = new BloodCakeSoup();
    
    //매개변수가 Food인 경우 모든 Food 구현체를 넣을 수 있습니다.
    p.eat(h);
    p.eat(s);
    p.eat(b);
    
    //매개변수가 FavoriteFood인 경우 FavoriteFood 구현체만 넣을 수 있습니다.
    
    p.favoriteEat(h);
    p.favoriteEat(s);
//    p.favoriteEat(b);
    
  }

}
