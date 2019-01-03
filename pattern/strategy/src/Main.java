public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        client.setLogger(new ConsoleLogger());
        client.write("ConsoleLogger");

        client.setLogger(new FileLogger());
        client.write("FileLogger");

        client.setLogger(new TimeFileLogger());
        client.write("TimeFileLogger");
    }
}
