package Chap_08;

import Chap_08.Camara.FactoryCam;
import Chap_08.Reporter.NormalReporter;
import Chap_08.Reporter.Reportable;
import Chap_08.Reporter.VideoReporter;
import Chap_08.detector.AdvancedFireDetector;
import Chap_08.detector.Detectable;
import Chap_08.detector.FireDetector;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("========");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advanceFireDetector = new AdvancedFireDetector();
        advanceFireDetector.detect();

        System.out.println("========");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(normalReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
