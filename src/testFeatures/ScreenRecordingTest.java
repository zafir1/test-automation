package testFeatures;

public class ScreenRecordingTest implements testInterface {
    private static ScreenRecordingTest instance = null;

    private ScreenRecordingTest(){
        System.out.println("Instantiating ScreenRecording singleton testing class.");
    }

    public static ScreenRecordingTest getInstance(){
        if(instance==null){
            instance = new ScreenRecordingTest();
        }
        return instance;
    }

    @Override
    public int runTest() {
        System.out.println("Starting ScreenRecording test.");
        return 0;
    }

    @Override
    public String toString() {
        return "ScreenRecordingTest{}";
    }
}
