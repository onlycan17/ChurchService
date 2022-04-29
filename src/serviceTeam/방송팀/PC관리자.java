package serviceTeam.방송팀;

import serviceTeam.예배위원;

public class PC관리자 implements 방송팀, 예배위원{

  void 예배인트로화면송출(){
    System.out.println("예배인트로화면 송출");
  }

  void 찬양피피티송출(){
    System.out.println("찬양 피피티 송출");
  }

  void 설교자료영상송출(){
    System.out.println("설교자료 송출");
  }

  @Override
  public void 송출() {
    System.out.println("pc화면 송출");
  }

  @Override
  public void 송출끄기() {
    System.out.println("pc화면송출 끄기");
  }
}
