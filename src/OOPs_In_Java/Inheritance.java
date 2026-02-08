package OOPs_In_Java;

class pokemon{
    String type;
    int power;

    pokemon(){}  // Default constructor

    void print(){
        System.out.println(this.power + " " + this.type);
    }

    pokemon(String name,String type,int power){
        this.power = power;
        this.type = type;
    }
}

class LegendaryPokemon extends pokemon{  // child class
    String ability;
}

class StrongPokemon extends pokemon{  // child class
    int speed;
}

public class Inheritance {
    // story of parents and child
    // Quality of child == Quality of parents + Quality of child (Own)
    // pokemon --> parents
    // LegendaryPokemon  --> child
    // LegendaryPokemon = Quality of pokemon + ability
    public static void main(String[] args){
         LegendaryPokemon mewtwo = new LegendaryPokemon();
         mewtwo.ability = "Pressure";
         pokemon pikachu = new pokemon();
//         pikachu.ability = "abc";  --> Error

    }
}
