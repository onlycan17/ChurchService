import serviceTeam.방송팀.방송팀;
import serviceTeam.설교자;
import serviceTeam.찬양인도자;

public class 새벽예배 implements 예배 {
  방송팀 pc;
  방송팀 카메라;
  방송팀 음향;
  설교자 새벽설교자;
  찬양인도자 인도자;

  public void setPc(방송팀 pc) {
    this.pc = pc;
  }

  public void set카메라(방송팀 카메라) {
    this.카메라 = 카메라;
  }

  public void set음향(방송팀 음향) {
    this.음향 = 음향;
  }

  public void set새벽설교자(설교자 새벽설교자) {
    this.새벽설교자 = 새벽설교자;
  }

  public void set인도자(찬양인도자 인도자) {
    this.인도자 = 인도자;
  }


  @Override
  public void 방송() {
    pc.송출();
    카메라.송출();
    음향.송출();
  }

  @Override
  public void 방송종료() {
    음향.송출끄기();
    카메라.송출끄기();
    pc.송출끄기();
  }

  @Override
  public void 준비찬양() {
    인도자.찬양한다();
  }

  @Override
  public void 설교() {
    새벽설교자.설교한다();
  }

  @Override
  public void 기도() {
    새벽설교자.기도한다();
  }

  @Override
  public void 예배출석체크() {

  }

  @Override
  public void 교회광고() {

  }

  @Override
  public void 예배위원예배전기도() {

  }

  @Override
  public void 성가대특송() {

  }

  @Override
  public void 봉헌하기() {

  }

  @Override
  public void 예배찬양하다() {

  }

  @Override
  public void 설교자설교안내() {

  }

  @Override
  public void 예배마무리안내() {

  }
}
