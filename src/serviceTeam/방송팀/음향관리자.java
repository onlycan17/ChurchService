package serviceTeam.방송팀;

import serviceTeam.예배위원;

public class 음향관리자 implements 방송팀, 예배위원 {

  @Override
  public void 송출() {
    System.out.println("음향 송출");
  }

  @Override
  public void 송출끄기() {
    System.out.println("음향 송출 끄기");
  }
}
