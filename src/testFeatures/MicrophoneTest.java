package testFeatures;

public class MicrophoneTest implements testInterface{

    private static MicrophoneTest instance = null;

    private MicrophoneTest() {
        System.out.println("Instantiating Microphone singleton testing class.");
    }

    public static MicrophoneTest getInstance(){
        if(instance==null){
            instance = new MicrophoneTest();
        }
        return instance;
    }


    @Override
    public int runTest() {
        System.out.println("Starting Microphone testing.");
        return 0;
    }

    @Override
    public String toString() {
        return "MicrophoneTest{}";
    }
}
