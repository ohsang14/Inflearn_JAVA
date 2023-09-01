package chap_07.camara;

// SpeedCam is a Camara. (IS-A)
public class SpeedCam extends Camara{ // 자식 클래스


    public SpeedCam() {
//        this.name = "과속 단속 카메라";
        super("과속단속 카메라");
    }
    public void takePicture(){
       super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }


    public void checkSpeed(){
        // 속도 체크
        System.out.println("속도를 측정 합니다");
    }
    public void recognizeLicensePlate(){
        //번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation : 부모 클레스의 메소드를 자식 클래스 메소드에서 오버라이딩 한다
    public void showMainFeature() {
            System.out.println(this.name + "의 주요 기능: 속도 측정, 번호 인식");
    }
}

