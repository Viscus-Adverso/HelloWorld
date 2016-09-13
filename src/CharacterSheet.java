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
    static int minimumAge = 16;

    CharacterSheet(String newName, int newAge, String newRace, String newClass, String newAlignment, String[] newInventory, String[] newSpells) {
        setName(newName);
        setAge(newAge);
        setRace(newRace);
        setClass(newClass);
        setAlignment(newAlignment);
        setInventory(newInventory);
        setSpells(newSpells);

    }

    String getName() {
        return name;
    }


    void setName(String newName) {
        if (isProperName(newName)){
            name = newName;
        }
    }

    int getAge() {
        return age;
    }

    void setAge(int newAge) {
        if (newAge >= minimumAge) {
            age = newAge;
        }
    }

    String getRace() {
        return race;
    }

    void setRace(String newRace) {
        race = newRace;
    }

    String getClassType() {
        return classType;
    }

    void setClass(String newClass) {
        classType = newClass;
    }

    String getAlignment() {
        return alignment;
    }

    void setAlignment(String newAlignment) {
        alignment = newAlignment;
    }

    String[] getInventory() {
        return inventory;
    }

    void setInventory(String[] newInventory) {
        inventory = newInventory;
    }

    String[] getSpells() {
        return spells;
    }

    void setSpells(String[] newSpells) {
        spells = newSpells;
    }

    static boolean isProperName(String name) {
        return name.contains (" ");
    }
}

