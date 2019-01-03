
public class Client {
    private ILogger logger;

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

    public void write (String msg){
        logger.write(msg);
    }
}