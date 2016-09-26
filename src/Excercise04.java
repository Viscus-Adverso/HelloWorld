import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Viscus on 9/26/16.
 */
public class Excercise04 {
    public static void main(String[] args) {
        String[] names = {"charlies", "david", "chuck", "bob", "alice", "andrew"};
        ArrayList<String> sortedNames = new ArrayList<>();
        //sortedNames must contain the names sorted alphabetically
        for (String name : names) {
            int index = 0;
            //find the corrext index
            for (String sortedName : sortedNames) {
                if (name.compareTo(sortedName) > 0 ) {
                    index++;
                }
                else {
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);
        Arrays.sort(names);
    }
}

