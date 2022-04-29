import serviceTeam.방송팀.방송팀;
import serviceTeam.사회자;
import serviceTeam.설교자;
import serviceTeam.찬양인도자;

public final class 수요예배Builder {

  방송팀 pc;
  방송팀 카메라;
  방송팀 자막송출;
  방송팀 음향관리자;
  사회자 수요사회자;
  설교자 수요설교자;
  찬양인도자 수요찬양인도자;

  private 수요예배Builder() {
  }

  public static 수요예배Builder a수요예배() {
    return new 수요예배Builder();
  }

  public 수요예배Builder withPc(방송팀 pc) {
    this.pc = pc;
    return this;
  }

  public 수요예배Builder with카메라(방송팀 카메라) {
    this.카메라 = 카메라;
    return this;
  }

  public 수요예배Builder with자막송출(방송팀 자막송출) {
    this.자막송출 = 자막송출;
    return this;
  }

  public 수요예배Builder with음향관리자(방송팀 음향관리자) {
    this.음향관리자 = 음향관리자;
    return this;
  }

  public 수요예배Builder with수요사회자(사회자 수요사회자) {
    this.수요사회자 = 수요사회자;
    return this;
  }

  public 수요예배Builder with수요설교자(설교자 수요설교자) {
    this.수요설교자 = 수요설교자;
    return this;
  }

  public 수요예배Builder with수요찬양인도자(찬양인도자 수요찬양인도자) {
    this.수요찬양인도자 = 수요찬양인도자;
    return this;
  }

  public 수요예배 build() {
    수요예배 수요예배 = new 수요예배();
    수요예배.setPc(pc);
    수요예배.set카메라(카메라);
    수요예배.set자막송출(자막송출);
    수요예배.set음향관리자(음향관리자);
    수요예배.set수요사회자(수요사회자);
    수요예배.set수요설교자(수요설교자);
    수요예배.set수요찬양인도자(수요찬양인도자);
    return 수요예배;
  }
}
