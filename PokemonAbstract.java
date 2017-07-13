import java.util.*;

public abstract class PokemonAbstract implements Pokedex{
   
   public Pokemon Pokemon(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        numOfPokemon++;
        System.out.println("New Pokemon added to the Pokedex");
    }

    public void attackPokemon(Pokemon pokemon){
        pokemon.health -= 10;
        System.out.println("Attacked another pokemon and reduced their health by 10 and their health is now at " + pokemon.health);
    }



}