package Chap_08.detector;

public class FireDitector implements Detectable{
    @Override
    public void detect() {
        System.out.println("일반 성능으로 화재를 감지합니다.");
    }
}
