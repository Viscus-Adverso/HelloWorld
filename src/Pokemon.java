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

    Pokemon(String newSpecies, int newLevel, PokemonType newPokemonType, String newSize, String newWeight, String[] newMoves) {
        setSpecies(newSpecies);
        setLevel(newLevel);
        setPokemonType(newPokemonType);
        setHeight(newSize);
        setWeight(newWeight);
        setMoves(newMoves);
    }

    String getSpecies() {
        return species;
    }

    void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    PokemonType getType() {
        return type;
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

    String getHeight() {
        return height;
    }

    void setHeight(String newSize) {
        height = newSize;
    }

    String getWeight() {
        return weight;
    }

    void setWeight(String newWeight) {
        weight = newWeight;
    }

    String[] getMoves() {
        return moves;
    }

    void setMoves(String[] newMoves) {
        moves = newMoves;
    }
}
