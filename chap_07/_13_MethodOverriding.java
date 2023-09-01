package chap_07;

import chap_07.camara.Camara;
import chap_07.camara.FactoryCam;
import chap_07.camara.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        //메소드 오버라이딩: 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기 (재정의)
        Camara camara = new Camara();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camara.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

    }
}
