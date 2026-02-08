package strings;

public class Reverse_string_Without_Using {
    public static void main(String[] args){
        String str = "hello";
        String reversed = "";

        // Loop se last se first tak characters add karenge
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
