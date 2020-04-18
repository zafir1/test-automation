package testFeatures;

public class VideoCommentTest implements  testInterface{

    private static VideoCommentTest instance = null;

    private VideoCommentTest(){
        System.out.println("Instantiating VideoCommentTest singleton testing class.");
    }

    public static VideoCommentTest getInstance(){
        if(instance==null){
            instance = new VideoCommentTest();
        }
        return instance;
    }

    @Override
    public int runTest() {
        System.out.println("Starting video comment test.");
        return 0;
    }

    @Override
    public String toString() {
        return "VideoCommentTest{}";
    }
}
