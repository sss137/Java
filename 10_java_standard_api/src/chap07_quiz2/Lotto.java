package chap07_quiz2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
  
  /**
   * 로또 구매<br>
   * 로또 구매를 위해서 사용자로부터 money를 입력 받는 메소드<br>
   * 로또 구매 비용은 최소 1000, 최대 100000입니다.<br>
   * @return money 실제 로또 구매 비용을 반환. 1000 미만 단위는 버리고 반환. ex) 5999 입력 시 5000 반환
   * @throws RuntimeException 정수를 입력하지 않으면 InputMismatchException 예외 발생. 부적절한 로또 구매 비용 입력 시 예외 발생.
   */
  public int buyLotto() throws RuntimeException {
    
    return 0;
    
  }
  
  /**
   * 로또 번호 생성<br>
   * 로또 구매 비용만큼 로또 번호를 자동 생성하는 메소드<br>
   * 생성된 로또 번호를 List<String> papers에 저장한 뒤 이를 반환합니다.<br>
   * @param money 로또 구매 비용
   * @return paper 로또 구매 내역
   */
  public List<String> generateLotto(int money) {
    
    /*
     * 예시) 5000원 구매 (종이1장, 5게임)
     * 
     * Lotto를 얼마나 구입하시겠습니까?(최대 10만원) >>> 5000
     * 
     * 01 :   19  21   6  41  42  44
     * 02 :    1   2  22  24   8  30
     * 03 :   32  36  21  25  27  12
     * 04 :   17  19  38  25  10  26
     * 05 :   33  36   4   8  11  45
     */
    /*
     * 예시) 10000원 구매 (종이2장, 10게임)
     * 
     * Lotto를 얼마나 구입하시겠습니까?(최대 10만원) >>> 10000
     * 
     * 01 :   19  21   6  41  42  44
     * 02 :    1   2  22  24   8  30
     * 03 :   32  36  21  25  27  12
     * 04 :   17  19  38  25  10  26
     * 05 :   33  36   4   8  11  45
     * 
     * 01 :    1  36   4  23  27  14
     * 02 :    2   4  25  10  43  13
     * 03 :   34   4  22   8  10  12
     * 04 :   16  21  27  44  45  31
     * 05 :   16  20  23  24   9  44
     */
    
    
    return null;
    
  }
  
}