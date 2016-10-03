/**
 * Created by Viscus on 10/3/16.
 */
public class AnonymousFunctions implements Runnable {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();

        Runnable r2 = () -> {
            System.out.println("Hello from anonymous function!");
        };

        r2.run();

        AnonymousFunctions r3 = new AnonymousFunctions();
        r3.run();
    }

    @Override
    public void run() {
        System.out.println("Hello from separate method!");
    }
}
