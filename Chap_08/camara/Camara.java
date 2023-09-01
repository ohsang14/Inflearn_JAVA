package Chap_08.camara;

public abstract class Camara {
    public void tackPicture(){
        System.out.println("사진을 촬영합니다");
    }
    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }
    public  abstract void showMainFeature(); // 구현해야 하는 메소드
}
