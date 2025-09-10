package SingleResponsibility.example1;

public class Main {
    public static void main(String[] args) {
        ReportGenerator reportGenerator=new ReportGenerator();
        String report=reportGenerator.generate();

        ReportSaver reportSaver=new ReportSaver();
        reportSaver.save(report);

        ReportSender reportSender=new ReportSender();
        reportSender.send(report);
    }
}
