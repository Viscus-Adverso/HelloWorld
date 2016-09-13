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

    void setMtype(String newMType){
        mainType = newMType;
    }

    void setSecondaryType(String newSecondaryType){
        secondaryType = newSecondaryType;
    }
}
