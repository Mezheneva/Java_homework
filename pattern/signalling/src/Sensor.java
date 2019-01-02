
import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private List<Signalling> warnings = new ArrayList<>();

    public void addWarning (Signalling warning) {
        warnings.add(warning);
    }

    public void changeTemp (int temp) {
        System.out.println("Temp " + temp);
        notification(temp);
    }

    public void notification(int temp) {
        for (Signalling w : warnings) {
            w.tempChanged(temp);
        }
    }
}