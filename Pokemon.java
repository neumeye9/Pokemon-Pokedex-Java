import java.util.*;

class Pokemon{
    protected String name;
    protected int health;
    protected String type;
    protected static int numOfPokemon;

    public Pokemon(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        numOfPokemon++;
        System.out.println("New Pokemon added to the Pokedex.");
    }
    
    public int howManyPokemon(){
        System.out.println("There are " + numOfPokemon +  " pokemon in the pokedex.");
        return numOfPokemon;
    }

    public String getName(){
        System.out.println("This Pokemon's name is " + name);
        return name;
    }

    public void setName(String pokeName){
        name = pokeName;
    }

    public int getHealth(){
        System.out.println("This Pokemon's health is " + health);
        return health;
    }

    public void setHealth(int pokeHealth){
        health = pokeHealth;
    }

    public String getType(){
        System.out.println("This Pokemon's type is " + type);
        return type;
    }

    public void setType(String pokeType){
        type = pokeType;
    }

    public void attackPokemon(Pokemon pokemon){
        pokemon.health -= 10;
        System.out.println("Attacked another pokemon and reduced their health by 10 and their health is now at " + pokemon.health);
    }

    public void pokemonInfo(Pokemon pokemon){
        System.out.println("This pokemon's name is " + this.name + ". It's current health is " + this.health + " . It's type is: " + this.type + " .");
    }
    
}