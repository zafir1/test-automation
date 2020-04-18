import testFeatures.*;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import tests.*;

public class Main {
    public static void main(String[] args) {
        testTypes tests = new testTypes();
        testBuilder testBuilder = tests.getTestBuilder();

        testBuilder.triggerTestFor("p1");

        testBuilder.triggerTestFor("p2");
    }
}
