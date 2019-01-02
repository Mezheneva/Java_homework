//Alarm
public interface Signalling {
    void tempChanged(int temp);
}

class GreenWarning implements Signalling {
    private boolean contTemp;

    @Override
    public void tempChanged(int temp) {
        if(temp < 100){
            contTemp = true;
        }
        if (temp >= 100 && contTemp) {
            System.out.println("Green");
            contTemp = false;
        }

    }
}

class YellowWarning implements Signalling {
    private boolean contTemp;
    @Override
    public void tempChanged(int temp) {
        if(temp < 300){
            contTemp = true;
        }
        if (temp >= 300 && contTemp) {
            System.out.println("Yellow");
            contTemp = false;
        }
    }
}

class RedAlert implements Signalling {
    private boolean contTemp;
    @Override
    public void tempChanged(int temp) {
        if(temp < 600){
            contTemp = true;
        }
        if (temp >= 600 && contTemp) {
            System.out.println("Red");
            contTemp = false;
        }
    }
}
