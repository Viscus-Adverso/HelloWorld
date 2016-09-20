import java.util.*;

/**
 * Created by Viscus on 9/20/16.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Email[] emails = {
          new Email("alice@gmail.com", "Hello", "yo", false),
          new Email("bob@gmail.com", "Hello", "yo", false),
          new Email("charlie@gmail.com", "Hello", "yo", false),
          new Email("alice@gmail.com", "Hello", "yo", false),
          new Email("bob@gmail.com", "Hello", "yo", false)
        };

        // hash map that looks like this:
        //"alice@gamil.com" -> array list of two emails
        //"bob@gamil.com" -> arraylist of two emails
        //"charlies@gmail.com" -> arraylist of one email


        HashMap<String, ArrayList<Email>> emailMap = new HashMap<>();


        for (Email e : emails) {
            ArrayList<Email> arr = emailMap.get(e.destination);
            if (arr == null) {
                arr= new ArrayList<>();
                emailMap.put(e.destination, arr);

            }
            arr.add(e):


        }

        emailMap.clear();

        for (Email e : emails) {
            if (!emailMap.containsKey(e.destination)) {
                emailMap.put(e.destination, new ArrayList<>()):
            }
            emailMap.get(e.destination).add(e);
        }

        System.out.println(emailMap);
    }
}
