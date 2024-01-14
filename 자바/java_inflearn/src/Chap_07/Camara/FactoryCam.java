package Chap_07.Camara;

// FactoryCam is a Camara. (IS - A)
public class FactoryCam extends Camara{
    public FactoryCam() {
        this.name = "공장 카메라";
    }
    public void recordVideo(){
        // 동영상 녹화
        super.recordVideo();
        detectFire();
    }
    public void detectFire(){
        // 화제 감지
        System.out.println("화재를 감지합니다.");
    }
    @Override
    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능 : 화재 감지" );
    }
}
