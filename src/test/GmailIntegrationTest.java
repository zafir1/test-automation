package test;

public class GmailIntegrationTest implements testInterface {
    private static GmailIntegrationTest instance = null;

    public GmailIntegrationTest() {
        System.out.println("Instantiating GmailIntegration singleton testing class.");
    }

    public static GmailIntegrationTest getInstance(){
        if(instance==null){
            instance = new GmailIntegrationTest();
        }
        return instance;
    }

    @Override
    public int runTest() {
        System.out.println("Starting gmail integration test.");
        return 0;
    }
}
