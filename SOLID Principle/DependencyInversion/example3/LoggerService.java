package DependencyInversion.example3;

public class LoggerService {

    private Logger logger;

    public LoggerService(Logger logger){
        this.logger=logger;
    }

   public void performTask(){
        logger.log("Task Started");
        logger.log("Task Completed");
   }
}
