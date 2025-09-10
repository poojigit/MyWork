package DependencyInversion.example3;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Console:" +message);
    }
}
