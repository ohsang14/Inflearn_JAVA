package Chap_08;

import Chap_08.Camara.Camara;
import Chap_08.Camara.FactoryCam;
import Chap_08.Camara.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)

        // Camara camara = new Camara();
        Camara factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        Camara speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
