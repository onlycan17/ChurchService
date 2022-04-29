package serviceTeam;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class 예배참석자 {
  private int 교인번호;

  public void set교인번호(int 교인번호) {
    this.교인번호 = 교인번호;
  }

  public int get교인번호() {
    return 교인번호;
  }
}
