import serviceTeam.방송팀.방송팀;
import serviceTeam.사회자;
import serviceTeam.설교자;
import serviceTeam.찬양인도자;

public class 수요예배 implements 예배{
  방송팀 pc;
  방송팀 카메라;
  방송팀 자막송출;
  방송팀 음향관리자;
  사회자 수요사회자;
  설교자 수요설교자;
  찬양인도자 수요찬양인도자;

  public void setPc(방송팀 pc) {
    this.pc = pc;
  }

  public void set카메라(방송팀 카메라) {
    this.카메라 = 카메라;
  }

  public void set자막송출(방송팀 자막송출) {
    this.자막송출 = 자막송출;
  }

  public void set음향관리자(방송팀 음향관리자) {
    this.음향관리자 = 음향관리자;
  }

  public void set수요사회자(사회자 수요사회자) {
    this.수요사회자 = 수요사회자;
  }

  public void set수요설교자(설교자 수요설교자) {
    this.수요설교자 = 수요설교자;
  }

  public void set수요찬양인도자(찬양인도자 수요찬양인도자) {
    this.수요찬양인도자 = 수요찬양인도자;
  }

  @Override
  public void 방송() {
    pc.송출();
    카메라.송출();
    음향관리자.송출();

  }

  @Override
  public void 방송종료() {
    음향관리자.송출끄기();
    카메라.송출끄기();
    pc.송출끄기();
  }

  @Override
  public void 준비찬양() {
    수요찬양인도자.찬양한다();
  }

  @Override
  public void 설교() {
    수요설교자.설교한다();
    수요설교자.기도한다();
  }

  @Override
  public void 기도() {
    수요사회자.예배시작기도();
  }

  @Override
  public void 예배출석체크() {

  }

  public void 교회광고(){
    수요사회자.사회진행();
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

  public void 설교자설교안내(){
    수요사회자.사회진행();
  }

  public void 예배마무리안내(){
    수요사회자.사회진행();
  }

}
