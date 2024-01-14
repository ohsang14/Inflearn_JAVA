package Chap_08.Camara;

public abstract class Camara {
    public void takePicture(){
        System.out.println("사진을 촬영합니다");
    }
    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature();
}
