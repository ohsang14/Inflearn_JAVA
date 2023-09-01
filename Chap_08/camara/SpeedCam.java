package Chap_08.camara;

import Chap_08.VideoReporter;
import Chap_08.detector.Detectable;
import Chap_08.reporter.Reportable;

public class SpeedCam extends Camara{
    private Detectable detector;
    private Reportable reproter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReproter(Reportable reproter) {
        this.reproter = reproter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }
    public void detect(){
        this.detector.detect();
    }
    public void report(){
        this.reproter.report();
    }

    public void setReporter(VideoReporter videoReporter) {
    }
}
