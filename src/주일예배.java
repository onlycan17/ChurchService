import java.util.List;
import serviceTeam.대표기도자;
import serviceTeam.방송팀.방송팀;
import serviceTeam.봉헌위원;
import serviceTeam.사회자;
import serviceTeam.설교자;
import serviceTeam.성가대;
import serviceTeam.악기팀.악기연주자;
import serviceTeam.예배참석자;
import serviceTeam.예배출석체크자;
import serviceTeam.찬양인도자;

public class 주일예배 implements 예배{

  private 방송팀 pc;
  private 방송팀 카메라;
  private 방송팀 자막송출;
  private 방송팀 음향관리자;
  private 사회자 주일사회자;
  private 설교자 주일설교자;
  private 악기연주자 피아노연주자;
  private List<악기연주자> 첼로연주자;
  private 악기연주자 플룻연주자;
  private List<악기연주자> 바이올린연주자;
  private 악기연주자 드럼연주자;
  private 대표기도자 주일대표기도자;
  private List<봉헌위원> 주일봉원위원;
  private List<성가대> 주일성가대;
  private List<찬양인도자> 주일찬양인도자;
  private List<예배출석체크자> 주일예배출석체크자;
  private List<예배참석자> 주일예배참석자;

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

  public 사회자 get주일사회자() {
    return 주일사회자;
  }

  public void set주일사회자(사회자 주일사회자) {
    this.주일사회자 = 주일사회자;
  }

  public void set주일설교자(설교자 주일설교자) {
    this.주일설교자 = 주일설교자;
  }

  public void set피아노연주자(악기연주자 피아노연주자) {
    this.피아노연주자 = 피아노연주자;
  }

  public void set첼로연주자(List<악기연주자> 첼로연주자) {
    this.첼로연주자 = 첼로연주자;
  }

  public void set플룻연주자(악기연주자 플룻연주자) {
    this.플룻연주자 = 플룻연주자;
  }

  public void set바이올린연주자(List<악기연주자> 바이올린연주자) {
    this.바이올린연주자 = 바이올린연주자;
  }

  public void set드럼연주자(악기연주자 드럼연주자) {
    this.드럼연주자 = 드럼연주자;
  }

  public void set주일대표기도자(대표기도자 주일대표기도자) {
    this.주일대표기도자 = 주일대표기도자;
  }

  public void set주일봉원위원(List<봉헌위원> 주일봉원위원) {
    this.주일봉원위원 = 주일봉원위원;
  }


  public void set주일성가대(List<성가대> 주일성가대) {
    this.주일성가대 = 주일성가대;
  }


  public void set주일찬양인도자(List<찬양인도자> 주일찬양인도자) {
    this.주일찬양인도자 = 주일찬양인도자;
  }


  public void set주일예배출석체크자(List<예배출석체크자> 주일예배출석체크자) {
    this.주일예배출석체크자 = 주일예배출석체크자;
  }

  public void set주일예배참석자(List<예배참석자> 주일예배참석자) {
    this.주일예배참석자 = 주일예배참석자;
  }

  @Override
  public void 방송() {
    pc.송출();
    카메라.송출();
    자막송출.송출();
    음향관리자.송출();
  }

  @Override
  public void 방송종료() {
    음향관리자.송출끄기();
    카메라.송출끄기();
    자막송출.송출끄기();
    pc.송출끄기();
  }

  @Override
  public void 준비찬양() {
    악기연주();
    for (찬양인도자 찬양인도자 : 주일찬양인도자) {
      찬양인도자.찬양한다();
    }
  }

  @Override
  public void 설교() {
    주일설교자.설교한다();
    주일설교자.기도한다();
  }

  @Override
  public void 기도() {
    주일대표기도자.기도한다();
  }

  public void 예배출석체크(){
    주일예배출석체크자.get(0).예배출석체크(주일예배참석자.get(0));
    주일예배출석체크자.get(0).예배출석체크(주일예배참석자.get(1));
    주일예배출석체크자.get(1).예배출석체크(주일예배참석자.get(2));
    주일예배출석체크자.get(1).예배출석체크(주일예배참석자.get(3));
    주일예배출석체크자.get(1).예배출석체크(주일예배참석자.get(4));
    System.out.println("주일예배출석체크완료!!");
  }

  public void 교회광고(){
    주일사회자.광고();
  }

  public void 예배위원예배전기도(){
    주일설교자.예배위원들모아기도();
  }

  public void 성가대특송(){
    악기연주();
    for (성가대 성가대 : 주일성가대) {
      성가대.특송한다();
    }
  }

  private void 악기연주(){
    피아노연주자.악기연주한다();
    for (악기연주자 악기연주자 : 바이올린연주자) {
      악기연주자.악기연주한다();
    }
    드럼연주자.악기연주한다();
    for (악기연주자 악기연주자 : 첼로연주자) {
      악기연주자.악기연주한다();
    }
    플룻연주자.악기연주한다();
  }

  public void 봉헌하기(){
    악기연주();
    for (성가대 성가대 : 주일성가대) {
      성가대.봉헌송한다();
    }
    for (봉헌위원 봉헌위원 : 주일봉원위원) {
      봉헌위원.봉헌을걷는다();
    }
  }

  public void 예배찬양하다(){
    악기연주();
    주일찬양인도자.get(0).찬양한다();
  }


  public void 설교자설교안내(){
    주일사회자.사회진행();
  }

  public void 예배마무리안내(){
    주일사회자.사회진행();
  }

}
