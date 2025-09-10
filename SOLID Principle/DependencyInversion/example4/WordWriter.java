package DependencyInversion.example4;

public class WordWriter implements ReportGenerator{
    @Override
    public void generateReport(String message) {
        System.out.println("Report is generated using Word and the name is:" +message);
    }
}
