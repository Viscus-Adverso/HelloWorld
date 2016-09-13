/**
 * Created by Viscus on 9/12/16.
 */
public class Pokemon {
    String species;
    PokemonType type;
    int level;
    String height;
    String weight;
    String[] moves= new String[4];
    static int maximumLevel = 100;

    Pokemon(String newSpecies, PokemonType newPokemonType, int newLevel, String newSize, String newWeight, String[] newMoves) {
        setSpecies(newSpecies);
        setLevel(newLevel);
        setPokemonType(newPokemonType);
        setHeight(newSize);
        setWeight(newWeight);
        setMoves(newMoves);
    }

    void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    void setPokemonType(PokemonType newPokemonType) {
        type = newPokemonType;
    }

    int getLevel() {
        return level;
    }

    void setLevel(int newLevel) {
        if (newLevel <= maximumLevel) {
            level = newLevel;
        }
    }

    void setHeight(String newSize) {
        height = newSize;
    }

    void setWeight(String newWeight) {
        weight= newWeight;
    }

    String[] getMoves() {
        return moves;
    }

    void setMoves(String[] newMoves) {
        moves = newMoves;
    }
}
