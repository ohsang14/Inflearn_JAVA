package chap_07;

import chap_07.camara.Camara;
import chap_07.camara.FactoryCam;
import chap_07.camara.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        Camara camara = new Camara();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camara.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camara.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
