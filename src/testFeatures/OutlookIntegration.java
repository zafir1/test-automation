package testFeatures;

public class OutlookIntegration implements testInterface {
    private static OutlookIntegration instance = null;

    private OutlookIntegration() {
        System.out.println("Instantiating OutlookIntegration singleton testing class.");
    }

    public static OutlookIntegration getInstance(){
        if(instance==null){
            instance = new OutlookIntegration();
        }
        return instance;
    }

    @Override
    public int runTest() {
        System.out.println("Starting outlook integration test.");
        return 0;
    }

    @Override
    public String toString() {
        return "OutlookIntegration{}";
    }
}
