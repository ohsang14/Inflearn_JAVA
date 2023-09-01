package Chap_08;

import Chap_08.camara.FactoryCam;
import Chap_08.detector.AdvancedFireDetector;
import Chap_08.detector.Detectable;
import Chap_08.detector.FireDitector;
import Chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스, 뼈대만 제공
        // 단일! 상속 (extends)

        Reportable normalReporter= new NormalReporter();
        normalReporter.report();

        VideoReport videoReport = new VideoReport();
        videoReport.report();

        System.out.println("-------------------");

        Detectable fireDetector = new FireDitector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReportor(videoReport);

        factoryCam.detect();
        factoryCam.report();
    }
}
