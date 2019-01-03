class ConsoleLogger implements ILogger {
    @Override
    public void write(String data) {
        System.out.println(data);
    }
}
