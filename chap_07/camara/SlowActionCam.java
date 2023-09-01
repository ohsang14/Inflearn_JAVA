package chap_07.camara;

public class SlowActionCam extends ActionCam{
    public SlowActionCam(){
        this.name = "슬로우 액션 카메라";
    }
    public void makevideo(){
        System.out.println(this.name+ ":"+
                this.lens+"  멋진 슬로우 비디오를 제작합니다.");
    }
}
