import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Viscus on 9/16/16.
 */
public class HashMapStuff {
    static HashMap<String, Person> users= new HashMap<>();


    public static void main(String[] args) {
        users.put("Alice", new Person("Alice", 30, true));
        users.put("Bob", new Person("Bob", 40, true));

        Scanner scanner = new Scanner(System.in);

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("Enter username;");
            String name = scanner.nextLine();

            if (!users.containsKey(name)) {
                System.out.println("do you want to create an account?");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    Person p = new Person(name, 20, true);
                    users.put(name, p);
                } else {
                    System.out.println("Have a nice day.");
                    continue;
                }
            }

            Person person = users.get(name);

            System.out.println("Logged in as: " + person.name);

//            boolean loggedIn = true;
//            while (loggedIn) {
//                System.out.println("[1] check balance");
//                System.out.println("[2] withdraw");
//                System.out.println("[3] cancel");
//
//
//            }
        }
    }
}
