package Chap_07;

import Chap_07.Camara.Camara;
import Chap_07.Camara.FactoryCam;
import Chap_07.Camara.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식 클레스에서 부모 클래스의 메소드를 덮어쓰기 ( 재정의 )
        Camara camara = new Camara();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camara.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
