package chap_07.camara;

// FactoryCam is a Camara. (IS-A)
public class FactoryCam extends Camara{ // 자식 클래스

    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장 카메라");
    }
    public void recordVideo(){
        super.recordVideo();
        detectFire();
    }


    public void detectFire(){
        // 화재 감지
        System.out.println("화제를 감지합니다.");
    }
    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능: 화제 감지");
    }
}
