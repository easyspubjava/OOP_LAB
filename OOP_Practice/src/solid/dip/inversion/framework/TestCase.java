package solid.dip.inversion.framework;

public abstract class TestCase {

    public void test() {
        if (
                doTest()) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed");
        }
    }

    public abstract boolean doTest();
}
