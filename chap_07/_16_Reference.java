package chap_07;

import chap_07.camara.Camara;

public class _16_Reference {
    public static void main(String[] args) {
        //참조
        // 기본 자료형(Primitive Data Types): int, float, double, long, boolean, ...
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]);

        // 참조 자료형 (Non-Primitive, Reference Data Types): String, Camera, FactoryCam, SpeedCam,...
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camara[] c = new Camara[3];
        System.out.println(c[0] == null); //true

        ///////////////////
        System.out.println("-----------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println("-----------");
        Camara c1 = new Camara();
        Camara c2 = new Camara();
        c1.name = "카메라 1";
        c2.name = "카메라 2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1;
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("------------------");
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);


    }
    public static void changeName(Camara camara){
        camara.name = "잘못된 카메라";



    }
}
