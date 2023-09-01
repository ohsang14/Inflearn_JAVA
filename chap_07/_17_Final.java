package chap_07;

import chap_07.camara.ActionCam;
import chap_07.camara.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final : 선언과 동시에 초기화, 값은 선언은 하지만 변경 불가
        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makevideo();
        System.out.println("------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makevideo();
    }
}
