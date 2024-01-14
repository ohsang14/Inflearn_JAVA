package Chap_07;

import Chap_07.Camara.Camara;
import Chap_07.Camara.FactoryCam;
import Chap_07.Camara.SpeedCam;

public class _12_inheritance {
    public static void main(String[] args) {
        // 상속
        Camara camara = new Camara();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camara.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        System.out.println("==========");

        camara.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        System.out.println("==========");

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
