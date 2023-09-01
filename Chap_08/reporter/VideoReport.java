package Chap_08.reporter;

public class VideoReport implements Reportable{
    @Override
    public void report() {
        System.out.println("직전 30초 영상을 지원합니다.");
    }
}
