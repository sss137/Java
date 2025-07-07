package chap06_BankAccount;

public class DepositException extends Exception {  //extends RuntimeException으로 해도 됩니다.
                                                     //그러면 throws DepositException 이런 것들 생략 가능     
  public DepositException(String message) {
    
    super(message);
  }

}
