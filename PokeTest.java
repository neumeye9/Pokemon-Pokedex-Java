class PokeTest{
    public static void main(String[] args){
        Pokemon c = new Pokemon("Dugtrio", 100, "Mole");
        Pokemon d = new Pokemon("Butterfree", 100, "Butterfly");

        d.attackPokemon(c);
        c.pokemonInfo(c);
    }
}