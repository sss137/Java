package chap04_openapi.a_naver_search;

import java.util.List;

public class ApiResponse {

  private String lastBuidDate;
  private int total;
  private int start;
  private int display;
  private List<Item> items;
  
  public String getLastBuidDate() {
    return lastBuidDate;
  }
  public void setLastBuidDate(String lastBuidDate) {
    this.lastBuidDate = lastBuidDate;
  }
  public int getTotal() {
    return total;
  }
  public void setTotal(int total) {
    this.total = total;
  }
  public int getStart() {
    return start;
  }
  public void setStart(int start) {
    this.start = start;
  }
  public int getDisplay() {
    return display;
  }
  public void setDisplay(int display) {
    this.display = display;
  }
  public List<Item> getItems() {
    return items;
  }
  public void setItems(List<Item> items) {
    this.items = items;
  }
  
}
