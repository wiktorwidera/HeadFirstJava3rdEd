import java.util.ArrayList;

public class V3Radiator {
    V3Radiator(ArrayList<SimUnit> lglist) {
        for (int g = 0; g < 10; g++) {
            lglist.add(new SimUnit("V3Radiator"));
        }
    }
}
