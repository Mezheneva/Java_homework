public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.addWarning(new GreenWarning());
        sensor.addWarning(new YellowWarning());
        sensor.addWarning(new RedAlert());

        for(int i = 0; i<1000; i+=100) {
            sensor.changeTemp(i);
        }


        for(int i = 1000; i>0; i-=100) {
            sensor.changeTemp(i);
        }

        for(int i = 0; i<1000; i+=100) {
            sensor.changeTemp(i);
        }

    }
}
