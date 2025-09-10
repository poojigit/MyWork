package DependencyInversion.example3;


public class Main {
    public static void main(String[] args) {
        Logger file=new FileLogger();
        LoggerService loggerService=new LoggerService(file);
        loggerService.performTask();

        Logger console=new ConsoleLogger();
        LoggerService loggerService1=new LoggerService(console);
        loggerService1.performTask();
    }
}
