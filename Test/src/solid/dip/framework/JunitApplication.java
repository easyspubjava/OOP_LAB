package solid.dip.framework;

import java.util.ArrayList;
import java.util.List;

public class JunitApplication {
    public static List<TestCase> testCases = new ArrayList<>();
    public static void registerTestCase(TestCase testCase){
        testCases.add(testCase);
    }

    public static void main(String[] args){
        for(TestCase testCase : testCases){
            testCase.doTest();
        }
    }

}
