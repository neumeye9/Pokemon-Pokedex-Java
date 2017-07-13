class PokemonAbstractTest{
    public static void main(String[] args){
        Pokemon e = new Pokemon("Metapod", 100, "Cocoon");
        Pokemon f = new Pokemon("Ivysaur", 100, "Seed");

        f.attackPokemon(e);
        e.pokemonInfo(e);
    }
}