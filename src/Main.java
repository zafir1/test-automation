import test.*;

public class Main {
    public static void main(String[] args) {
        MicrophoneTest microphoneTest = MicrophoneTest.getInstance();
        microphoneTest.runTest();
        MicrophoneTest microphoneTest1 = MicrophoneTest.getInstance();
        microphoneTest1.runTest();
    }
}
