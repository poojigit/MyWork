package DependencyInversion.example4;

public class ReportGeneratorService {
    private ReportGenerator reportGenerator;
    public ReportGeneratorService (ReportGenerator reportGenerator){
        this.reportGenerator=reportGenerator;
    }

    /*public void generate(String message){
        reportGenerator.generateReport(message);
    }
*/
}
