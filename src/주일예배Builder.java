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

public final class 주일예배Builder {

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

  private 주일예배Builder() {
  }

  public static 주일예배Builder a주일예배() {
    return new 주일예배Builder();
  }

  public 주일예배Builder withPc(방송팀 pc) {
    this.pc = pc;
    return this;
  }

  public 주일예배Builder with카메라(방송팀 카메라) {
    this.카메라 = 카메라;
    return this;
  }

  public 주일예배Builder with자막송출(방송팀 자막송출) {
    this.자막송출 = 자막송출;
    return this;
  }

  public 주일예배Builder with음향관리자(방송팀 음향관리자) {
    this.음향관리자 = 음향관리자;
    return this;
  }

  public 주일예배Builder with주일사회자(사회자 주일사회자) {
    this.주일사회자 = 주일사회자;
    return this;
  }

  public 주일예배Builder with주일설교자(설교자 주일설교자) {
    this.주일설교자 = 주일설교자;
    return this;
  }

  public 주일예배Builder with피아노연주자(악기연주자 피아노연주자) {
    this.피아노연주자 = 피아노연주자;
    return this;
  }

  public 주일예배Builder with첼로연주자(List<악기연주자> 첼로연주자) {
    this.첼로연주자 = 첼로연주자;
    return this;
  }

  public 주일예배Builder with플룻연주자(악기연주자 플룻연주자) {
    this.플룻연주자 = 플룻연주자;
    return this;
  }

  public 주일예배Builder with바이올린연주자(List<악기연주자> 바이올린연주자) {
    this.바이올린연주자 = 바이올린연주자;
    return this;
  }

  public 주일예배Builder with드럼연주자(악기연주자 드럼연주자) {
    this.드럼연주자 = 드럼연주자;
    return this;
  }

  public 주일예배Builder with주일대표기도자(대표기도자 주일대표기도자) {
    this.주일대표기도자 = 주일대표기도자;
    return this;
  }

  public 주일예배Builder with주일봉원위원(List<봉헌위원> 주일봉원위원) {
    this.주일봉원위원 = 주일봉원위원;
    return this;
  }

  public 주일예배Builder with주일성가대(List<성가대> 주일성가대) {
    this.주일성가대 = 주일성가대;
    return this;
  }

  public 주일예배Builder with주일찬양인도자(List<찬양인도자> 주일찬양인도자) {
    this.주일찬양인도자 = 주일찬양인도자;
    return this;
  }

  public 주일예배Builder with주일예배출석체크자(List<예배출석체크자> 주일예배출석체크자) {
    this.주일예배출석체크자 = 주일예배출석체크자;
    return this;
  }

  public 주일예배Builder with주일예배참석자(List<예배참석자> 주일예배참석자) {
    this.주일예배참석자 = 주일예배참석자;
    return this;
  }

  public 주일예배 build() {
    주일예배 주일예배 = new 주일예배();
    주일예배.setPc(pc);
    주일예배.set카메라(카메라);
    주일예배.set자막송출(자막송출);
    주일예배.set음향관리자(음향관리자);
    주일예배.set주일사회자(주일사회자);
    주일예배.set주일설교자(주일설교자);
    주일예배.set피아노연주자(피아노연주자);
    주일예배.set첼로연주자(첼로연주자);
    주일예배.set플룻연주자(플룻연주자);
    주일예배.set바이올린연주자(바이올린연주자);
    주일예배.set드럼연주자(드럼연주자);
    주일예배.set주일대표기도자(주일대표기도자);
    주일예배.set주일봉원위원(주일봉원위원);
    주일예배.set주일성가대(주일성가대);
    주일예배.set주일찬양인도자(주일찬양인도자);
    주일예배.set주일예배출석체크자(주일예배출석체크자);
    주일예배.set주일예배참석자(주일예배참석자);
    return 주일예배;
  }
}
