import serviceTeam.방송팀.방송팀;
import serviceTeam.설교자;
import serviceTeam.찬양인도자;

public final class 새벽예배Builder {

  방송팀 pc;
  방송팀 카메라;
  방송팀 음향;
  설교자 새벽설교자;
  찬양인도자 인도자;

  private 새벽예배Builder() {
  }

  public static 새벽예배Builder a새벽예배() {
    return new 새벽예배Builder();
  }

  public 새벽예배Builder withPc(방송팀 pc) {
    this.pc = pc;
    return this;
  }

  public 새벽예배Builder with카메라(방송팀 카메라) {
    this.카메라 = 카메라;
    return this;
  }

  public 새벽예배Builder with음향(방송팀 음향) {
    this.음향 = 음향;
    return this;
  }

  public 새벽예배Builder with새벽설교자(설교자 새벽설교자) {
    this.새벽설교자 = 새벽설교자;
    return this;
  }

  public 새벽예배Builder with인도자(찬양인도자 인도자) {
    this.인도자 = 인도자;
    return this;
  }

  public 새벽예배 build() {
    새벽예배 새벽예배 = new 새벽예배();
    새벽예배.setPc(pc);
    새벽예배.set카메라(카메라);
    새벽예배.set음향(음향);
    새벽예배.set새벽설교자(새벽설교자);
    새벽예배.set인도자(인도자);
    return 새벽예배;
  }
}
