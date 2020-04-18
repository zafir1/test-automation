package testFeatures;

public class GenerateSubtitleTest implements testInterface{

    private static GenerateSubtitleTest instance = null;

    private GenerateSubtitleTest(){
        System.out.println("Instantiating GenerateSubtitleTest singleton testing class.");
    }

    public static GenerateSubtitleTest getInstance(){
        if(instance==null){
            instance = new GenerateSubtitleTest();
        }
        return instance;
    }

    @Override
    public int runTest() {
        System.out.println("Starting subtitle test.");
        return 0;
    }

    @Override
    public String toString() {
        return "GenerateSubtitleTest{}";
    }
}
