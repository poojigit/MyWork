package DependencyInversion.example4;

public class PDFWriter implements ReportGenerator{
    @Override
    public void generateReport(String message) {
        System.out.println("Report is generated in PDF and the name is:" +message);
    }
}
