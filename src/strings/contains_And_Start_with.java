package strings;

public class contains_And_Start_with {
    public static void main(String[] args){
         String s = "Physics Wallah Skills";
        System.out.println(s.contains("Physics Wallah"));
        System.out.println(s.contains("physics Wallah"));
        System.out.println(s.contains("a"));
        // Start with
        System.out.println(s.startsWith("Phy"));
        System.out.println(s.startsWith("Wallah"));
        System.out.println(s.endsWith("Skills"));
        System.out.println(s.endsWith("Wallah"));
    }
}
