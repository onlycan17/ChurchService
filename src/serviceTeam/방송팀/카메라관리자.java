package serviceTeam.방송팀;

import serviceTeam.예배위원;

public class 카메라관리자 implements 방송팀, 예배위원 {


  @Override
  public void 송출() {
    System.out.println("카메라 송출");
  }

  @Override
  public void 송출끄기() {
    System.out.println("카메라 송출 끄기");
  }
}
