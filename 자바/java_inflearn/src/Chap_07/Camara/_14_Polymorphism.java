package Chap_07.Camara;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class person: 사람
        // class Student extends Person :  학생 ( 학생은 사람이다. Student is a person)
        // class Teacher extends Person :  선생님( 선생님은 사람이다. Teacher is a person)

        Camara camara = new Camara();
        Camara factoryCam = new FactoryCam();
        Camara speedCam = new SpeedCam();


        camara.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("======");

        Camara [] camaras = new Camara[3];
        camaras[0] = new Camara();
        camaras[1] = new FactoryCam();
        camaras[2] = new SpeedCam();

        for (Camara cam : camaras) {
            cam.showMainFeature();
        }

        System.out.println("========");

        if(camara instanceof Camara) {
            System.out.println("카메라 입니다.");
        }
        if(factoryCam instanceof FactoryCam){
            ((FactoryCam)factoryCam).detectFire();
        }
        if(speedCam instanceof SpeedCam){
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }
    }
}
