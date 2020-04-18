package test;

public class WebcamTest implements testInterface {

    private static WebcamTest instance = null;

    private WebcamTest(){
        System.out.println("Instantiating Webcam singleton testing class.");
    }

    public static WebcamTest getInstance(){
        if(instance==null){
            instance = new WebcamTest();
        }
        return instance;
    }

    @Override
    public int runTest() {
        System.out.println("Starting webcam test.");
        return 0;
    }
}
