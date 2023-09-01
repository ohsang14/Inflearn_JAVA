package chap_07.camara;

public class ActionCam extends Camara{
    public final String  lens = "광각렌즈";
    public ActionCam(){
        super("액션 카메라");
    }
    public void makevideo(){
        System.out.println(this.name+ ":"+ this.lens+"  멋진 비디오를 제작합니다.");
    }
}
