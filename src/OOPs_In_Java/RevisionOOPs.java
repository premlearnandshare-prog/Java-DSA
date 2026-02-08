package OOPs_In_Java;

public class RevisionOOPs {
    public static class pokemon{
        int hp;
        int speed;
        int attack;
        int defense;
        String type;
        String name;

        pokemon(){  // Default constructor

        }

        pokemon(String name,String type,int attack){
            this.name = name;
            this.type = type;
            this.attack = attack;
        }
    }
    public static void main(String[] args){
         pokemon p1 = new pokemon("pikachu","Electric",70);
        pokemon p2 = new pokemon("Charizard","Fire",110);
         pokemon p3 = p1;  // p3 is shallow copy of p1
        p3.type = "water";
        System.out.println(p1.type);
    }
}
