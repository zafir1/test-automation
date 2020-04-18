package testFeatures;

public class ZoomIntegrationTest implements testInterface {
    private static ZoomIntegrationTest instance = null;

    private ZoomIntegrationTest() {
        System.out.println("Instantiating ZoomIntegration singleton testing class.");
    }

    public static ZoomIntegrationTest getInstance(){
        if(instance==null){
            instance = new ZoomIntegrationTest();
        }
        return instance;
    }

    @Override
    public int runTest() {
        System.out.println("Starting Zoom integration test.");
        return 0;
    }

    @Override
    public String toString() {
        return "ZoomIntegrationTest{}";
    }
}
