package serviceTeam;

import java.util.ArrayList;
import java.util.List;

public class 예배출석체크자 {

  private static List<예배참석자> 참석자리스트 = new ArrayList<예배참석자>();

  public void 예배출석체크(예배참석자 주일예배참석자){
    this.참석자리스트.add(주일예배참석자);
  }
}
