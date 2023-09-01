package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원


        b1.insertMemoryCard((256));

        // 일반 영상 : 1
        // 이벤트 영상( 충돌 감지) :2
        int fileCoint = b1.getVideoFileCount(1); // 일반 영상
        System.out.println("일반 영상 파일 수: " + fileCoint+"개");

        fileCoint = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수: " + fileCoint + "개");
    }
}
