package Chap_08.Camara;

import Chap_08.Reporter.Reportable;
import Chap_08.detector.Detectable;

public class FactoryCam extends Camara implements Detectable, Reportable {
    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void report() {
        reporter.report();
    }

    @Override
    public void detect() {
        detector.detect();
    }
}
