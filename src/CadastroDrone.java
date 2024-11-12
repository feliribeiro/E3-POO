import java.util.ArrayList;

public class CadastroDrone {

    private ArrayList drones;

    public CadastroDrone() {
        drones = new ArrayList();
    }

    public void addDrone(Drone d) {
        drones.add(d);
    }
}
