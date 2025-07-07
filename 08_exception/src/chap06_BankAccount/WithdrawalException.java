package chap06_BankAccount;

public class WithdrawalException extends Exception {  //extends RuntimeException으로 해도 됩니다.
                                                        //그러면 throws WithdrawalException 이런 것들 생략 가능
  public WithdrawalException(String message) {
    
    super(message);
  }
  
}
