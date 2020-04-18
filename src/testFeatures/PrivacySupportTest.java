package testFeatures;

public class PrivacySupportTest implements testInterface{
    private static PrivacySupportTest instance = null;

    private PrivacySupportTest(){
        System.out.println("Instantiating PrivacySupport singleton testing class.");
    }

    public static PrivacySupportTest getInstance(){
        if(instance==null){
            instance = new PrivacySupportTest();
        }
        return instance;
    }

    @Override
    public int runTest() {
        System.out.println("Starting PrivacySupport test.");
        return 0;
    }

    @Override
    public String toString() {
        return "PrivacySupportTest{}";
    }
}
