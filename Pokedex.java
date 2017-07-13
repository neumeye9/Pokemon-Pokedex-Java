import java.util.*;

public interface Pokedex{

    Pokemon Pokemon(String name, int health, String type);
    void attackPokemon(Pokemon pokemon);
    void pokemonInfo(Pokemon pokemon);

    //example static method 

    static void staticMethod(){
        System.out.println("Hello from the static method of the interface");
    }




}