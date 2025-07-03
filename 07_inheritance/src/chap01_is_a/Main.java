package chap01_is_a;

/*
 * A는 B이다.(is-a 관계) << A는 자식, B는 부모
 * 학생은 사람이다.      Student is a Person.
 * 직장인은 사람이다.    Worker is a Person.
 * 개발자는 직장인이다.  Developer is a Worker.
 * 디자이너는 워커이다.  Designer is a Worker.
 */
public class Main {

  public static void main(String[] args) {

    //Student
    Student std = new Student();
    std.eat();
    std.sleep();
    std.study();
    System.out.println();
    
    //Worker
    Worker wk = new Worker();
    wk.eat();
    wk.sleep();
    wk.startWork();
    wk.finishWork();
    System.out.println();
    
    //Developer
    Developer dvl = new Developer();
    dvl.eat();
    dvl.sleep();
    dvl.startWork();
    dvl.finishWork();
    dvl.develop();
    System.out.println();
    
    //Designer
    Designer ds = new Designer();
    ds.eat();
    ds.sleep();
    ds.startWork();
    ds.finishWork();
    ds.design();
    
  }

}
