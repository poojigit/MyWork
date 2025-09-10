package DependencyInversion.example3;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Writing to file:" +message);
    }
}
