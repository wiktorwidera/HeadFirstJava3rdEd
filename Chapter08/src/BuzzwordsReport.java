public class BuzzwordsReport extends Report {
    @Override
    void runReport() {
        super.runReport();
        buzzwordCompliance();
        printReport();
    }
    void buzzwordCompliance() {}
}
