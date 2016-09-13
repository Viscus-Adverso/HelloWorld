/**
 * Created by Viscus on 9/12/16.
 */
public class CharacterSheet {
    String name;
    int age;
    String race;
    String classType;
    String alignment;
    String[] inventory= new String[25];
    String[] spells= new String[15];

    CharacterSheet(String newName, int newAge, String newClass, String newAlignment) {
        setName(newName);
        setAge(newAge);
        setClass(newClass);
        setAlignment(newAlignment);
    }

    String getName() {
        return name;
    }


    void setName(String newName) {
        if (isProperName(newName)){
            name = newName;
        }
    }

    void setAge(int newAge) {
        if (newAge >= 16) {
            age = newAge;
        }
    }

    void setClass(String newClass) {
        classType = newClass;
    }

    void setAlignment(String newAlignment) {
        alignment = newAlignment;
    }

    static boolean isProperName(String name) {
        return name.contains (" ");
    }
}

