package DependencyInversion.example4;

public class Main {
    public static void main(String[] args) {
        ReportGenerator pdf=new PDFWriter();
        ReportGeneratorService reportGeneratorService=new ReportGeneratorService(pdf);
        pdf.generateReport("I am daughter of Aalok Kumar and Pinki Rani");

        ReportGenerator wordwriter=new WordWriter();
        ReportGeneratorService reportGeneratorService1=new ReportGeneratorService(wordwriter);
        wordwriter.generateReport("My brother's name is Anubhav Kumar Singh");

        ReportGenerator consolewriter = new ConsoleWriter();
        ReportGeneratorService reportGeneratorService2=new ReportGeneratorService(consolewriter);
        consolewriter.generateReport("My husband name is Apoorv Raj Singh");

    }
}
