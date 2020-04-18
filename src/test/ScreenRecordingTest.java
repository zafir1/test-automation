package test;

public class ScreenRecordingTest implements testInterface {
    private static ScreenRecordingTest instance = null;

    private ScreenRecordingTest(){
        System.out.println("Instantiating ScreenRecording singleton testing class.");
    }

    @Override
    public int runTest() {
        System.out.println("Starting ScreenRecording test.");
        return 0;
    }
}
