package chap04_InputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * java.io.InputStream
 * 1. 바이트 기반 입력스트림의 최상위 추상클래스입니다.(직접 인스턴스를 생성할 수 없습니다.)
 * 2. 파일, 네트워크 등으로부터 바이트 단위로 데이터를 읽어올 수 있습니다.
 * 3. 주요 하위클래스
 *    1) FileInputStream
 *    2) BufferedInputStream
 *    3) DataInputStream
 * 4. 주요 메소드
 *    1) int read(): 입력스트림에서 1바이트를 읽고, 그 값을 0~255 사이의 정수로 반환합니다.
                     만약 읽을 데이터가 더 이상 없으면 -1을 반환합니다.(EOF(End Of File)을 반환)
 *                   (1바이트를 int로 변환하면 0 ~ 255 값으로 반환되는데 이렇게 처리하면 
 *                   -1(EOF)과 반환하는 값의 차이를 만들 수 있습니다.)
 *                   (1바이트를 byte 그대로 반환하면 -128 ~ 127 값으로 반환하는데 이러면
 *                   -1(EOF)과 반환하는 값의 구분이 어렵습니다.)
 *    2) int read(byte[] b): 전달한 바이트 배열만큼 읽어서 배열에 저장(읽은 데이터는 byte[] b에 저장됩니다.)
 *                           실제로 읽은 바이트 수를 반환합니다.
 *                           (읽을 데이터가 없으면 -1(EOF)을 반환)
 *    3) int read(byte[]b, int off, int len): 전달한 바이트 배열의 일부만 사용해서 저장(인덱스 off부터 ien개만큼)
 *                                            실제로 읽은 바이트 수를 반환합니다.
 *                                            (읽을 데이터가 없으면 -1(EOF)을 반환)
 *    4) close(): 입력 스트림을 닫고 자원을 해제
 */
public class Main {

  public static void bufferedInputStream() {
    
    File file = new File("C:/Program Files/Java/jdk-17", "README");
    
    try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file))) {
      //int를 이용해 1바이트 단위로 파일 읽기
      int c;
      
      //파일에서 읽은 데이터를 저장해 둘 byte[] 배열
      byte[] b = new byte[(int)file.length()];    //.length() 타입은 long입니다.
      int i = 0;

      while((c = bin.read()) != -1) {
        b[i++] = (byte)c;
      }
      System.out.println(new String(b));
      
//      List<Byte> list = new ArrayList<Byte>();
////      while((c = bin.read()) != -1) {
////        list.add((byte)c);
//      }
//      System.out.println(list.size());
//      System.out.println(list);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  public static void bufferedInputStream2() {
    
    File file = new File("C:/Program Files/Java/jdk-17", "README");
    
    try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream(file))) {
      //byte[] 배열을 이용해 20바이트 단위로 파일 읽기
      byte[] b = new byte[20];
      
      //파일에서 읽은 데이터를 저장해 둘 byte[] 배열
      byte[] bytes = new byte[(int)file.length()];    //.length() 타입은 long입니다.
      int i = 0;

      //파일로부터 실제로 읽은 바이트 수
      int readByte = 0;
      
      while((readByte = bin.read(b)) != -1) {
        //System.arraycopy(원본배열, 원본시작인덱스, 대상배열, 대상시작인덱스, 복사할개수);
        System.arraycopy(b, 0, bytes, i, readByte);
        i += readByte;
      }
      System.out.println(new String(bytes));
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
  public static void systemIn() throws IOException  {
    
    InputStream in = System.in;       //표준 입력스트림(키보드)을 연결
    
    int c;
    
    while((c = in.read()) != -1) {
      System.out.print((char)c);
    }
    
  }
  
  public static void dataInputStream() throws IOException {
    
    File file = new File("C:/storage/test.bin");
    
    DataInputStream din = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
    
    //저장되어 있는 순서대로 읽습니다.
    int x = din.readInt();        //writeInt()로 생성한 값 읽기
    double y = din.readDouble();  //writeDouble()로 생성한 값 읽기
    String s = din.readUTF();      //writeUTF()로 생성한 값 읽기
    
    System.out.println(x);
    System.out.println(y);
    System.out.println(s);         //바이트스트림이지만 한글이 깨지지 않습니다.
    
  }
  
  public static void main(String[] args) {

//    bufferedInputStream();
//    bufferedInputStream2();
    
    try {
//      systemIn();
      dataInputStream();
    } catch(Exception e) {
      e.printStackTrace();
    }
    
  }

}



