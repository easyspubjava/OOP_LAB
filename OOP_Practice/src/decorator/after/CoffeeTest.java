package decorator.after;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee etiopiaCoffee = new EtiopiaCoffee();
        etiopiaCoffee.brewing();
        System.out.println();

        Coffee etiopiaLatte = new Latte(etiopiaCoffee);
        etiopiaLatte.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(new KenayCoffee());
        kenyaLatte.brewing();
        System.out.println();

        Coffee mochaEtipia = new MochaSyrup(new Latte(new EtiopiaCoffee()));
        mochaEtipia.brewing();
        System.out.println();

        /*try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new Socket().getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
