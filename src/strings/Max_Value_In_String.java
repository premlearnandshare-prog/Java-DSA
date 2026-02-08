package strings;


public class Max_Value_In_String {
    public static void main(String[] args) {
//         String s = "10198";
//         int n = Integer.parseInt(s);
//        System.out.println(n);
//        String[] arr = {"999","1018","0078"};
//
        // Method 1
        int mx = Integer.MIN_VALUE;
        String[] arr = {"999","1018","0078"};
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            mx = Math.max(mx, n);
        }

        System.out.println(mx);

        // problem in code is we cannot convert and store
        // big number like "457396347389575985798"
    }

}
