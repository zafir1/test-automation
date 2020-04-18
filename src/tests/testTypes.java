package tests;
import testFeatures.*;

public class testTypes {
    private String[] types = new String[]{"p1","p2","free","starter","pro","growth"};
    private String p1 = types[0];
    private String p2 = types[1];
    private String free = types[2];
    private String starter = types[3];
    private String pro = types[4];
    private String growth = types[5];
    private testBuilder testBuilder;

    public testTypes(){
        this.testBuilder = new testBuilder();
        for(String s:types){
            this.testBuilder.addToList(s);
        }
        /*
        * P1 Test List
        * */
        this.testBuilder.addToList(p1,ScreenRecordingTest.getInstance());
        this.testBuilder.addToList(p1,WebcamTest.getInstance());
        this.testBuilder.addToList(p1,MicrophoneTest.getInstance());

        /*
        * P2 Test List
        * */
        this.testBuilder.addToList(p2, ZoomIntegrationTest.getInstance());
        this.testBuilder.addToList(p2,OutlookIntegration.getInstance());
        this.testBuilder.addToList(p2,PrivacySupportTest.getInstance());
        this.testBuilder.addToList(p2,VideoCommentTest.getInstance());

        /*
        * Features to test under free category
        * */
        this.testBuilder.addToList(free,ScreenRecordingTest.getInstance());
        this.testBuilder.addToList(free,WebcamTest.getInstance());
        this.testBuilder.addToList(free,MicrophoneTest.getInstance());
        this.testBuilder.addToList(free,VideoCommentTest.getInstance());

        /*
        * Features to test under starter plan
        * */

        this.testBuilder.addToList(starter,ScreenRecordingTest.getInstance());
        this.testBuilder.addToList(starter,WebcamTest.getInstance());
        this.testBuilder.addToList(starter,MicrophoneTest.getInstance());
        this.testBuilder.addToList(starter,VideoCommentTest.getInstance());
        this.testBuilder.addToList(starter,GmailIntegrationTest.getInstance());


        /*
         * Features to test under Pro plan
         * */
        this.testBuilder.addToList(pro,ScreenRecordingTest.getInstance());
        this.testBuilder.addToList(pro,WebcamTest.getInstance());
        this.testBuilder.addToList(pro,MicrophoneTest.getInstance());
        this.testBuilder.addToList(pro,VideoCommentTest.getInstance());
        this.testBuilder.addToList(pro,GmailIntegrationTest.getInstance());
        this.testBuilder.addToList(pro,OutlookIntegration.getInstance());

        /*
         * Features to test under Growth plan
         * */
        this.testBuilder.addToList(growth,ScreenRecordingTest.getInstance());
        this.testBuilder.addToList(growth,WebcamTest.getInstance());
        this.testBuilder.addToList(growth,MicrophoneTest.getInstance());
        this.testBuilder.addToList(growth,VideoCommentTest.getInstance());
        this.testBuilder.addToList(growth,GmailIntegrationTest.getInstance());
        this.testBuilder.addToList(growth,OutlookIntegration.getInstance());
        this.testBuilder.addToList(growth,GenerateSubtitleTest.getInstance());
        this.testBuilder.addToList(growth,PrivacySupportTest.getInstance());
        this.testBuilder.addToList(growth,ZoomIntegrationTest.getInstance());

        System.out.println("\n\n******************************************************\n\n");
    }

    public tests.testBuilder getTestBuilder() {
        return testBuilder;
    }
}
