package tests;
import testFeatures.*;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class testBuilder {
    private HashMap<String,List<testInterface>> tests;

    public testBuilder() {
        this.tests = new HashMap<>();
    }

    public List<testInterface> getList(String s){
        return this.tests.get(s);
    }

    public List<testInterface> addToList(String s,testInterface t){
        if(this.tests.get(s)==null){
            List<testInterface>list = new Vector<>();
            list.add(t);
            this.tests.put(s,list);
        }
        else{
            this.tests.get(s).add(t);
        }
        return this.tests.get(s);
    }

    public boolean addToList(String s){
        if(this.tests.get(s)==null){
            List<testInterface>list = new Vector<>();
            this.tests.put(s,list);
            return true;
        }
        return false;
    }

    public List<Integer>triggerTestFor(String s){
        List<Integer>list = new Vector<>();
        List<testInterface> testList = this.tests.get(s);
        if(testList==null){
            return list;
        }
        for(testInterface testItem:testList){
            list.add(testItem.runTest());
        }
        return list;
    }

    public void printTestList(String s){
        if(this.tests.get(s)==null){
            return;
        }
        for(testInterface item: this.tests.get(s)){
            System.out.println(item.toString());
        }
    }
}
