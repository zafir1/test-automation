package test;

public class OutlookIntegration implements testInterface {
    private static OutlookIntegration instance = null;

    public OutlookIntegration() {
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
}
