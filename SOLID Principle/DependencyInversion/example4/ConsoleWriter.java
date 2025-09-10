package DependencyInversion.example4;

public class ConsoleWriter implements ReportGenerator{
    @Override
    public void generateReport(String message) {
        System.out.println("Report is generated in Console and the message is:" +message);
    }
}
