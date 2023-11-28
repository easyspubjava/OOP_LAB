package solid.dip.framework;

public abstract class TestCase {

    public void run(){
        if(doTest()){
            System.out.println("test succceded");
        }
        else {
            System.out.println("test failed");
        }
    }

    public abstract boolean doTest();
}
