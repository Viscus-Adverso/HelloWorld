import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Viscus on 9/26/16.
 */
public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Charlie", "Bob"));
        Collections.sort(names);
        System.out.println(names);

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, true));
        people.add(new Person("Bob", 35, true));
        people.add(new Person("Charlie", 40, true));
        Collections.sort(people);
        System.out.println(people);
    }
}
