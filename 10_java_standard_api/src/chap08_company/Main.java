package chap08_company;

public class Main {

  public static void main(String[] args) {
    
    Company company = new Company("samsung");
    
    new CompanyHandler(company).manage();

  }

}
