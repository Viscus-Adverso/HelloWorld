/**
 * Created by Viscus on 9/12/16.
 */
public class PokemonType {
    String mainType;
    String secondaryType;


    PokemonType(String newMType, String newSecondaryType) {
        setMtype(newMType);
        setSecondaryType(newSecondaryType);
    }

    String getMainType() {
        return mainType;
    }

    void setMtype(String newMType){
        mainType = newMType;
    }

    String getSecondaryType() {
        return secondaryType;
    }

    void setSecondaryType(String newSecondaryType){
        secondaryType = newSecondaryType;
    }
}
