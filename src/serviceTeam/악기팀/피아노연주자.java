package serviceTeam.악기팀;

import serviceTeam.예배위원;

public class 피아노연주자 implements 악기연주자, 예배위원 {

  @Override
  public void 악기연주한다() {
    System.out.println("피아노를 연주한다.");
  }
}
