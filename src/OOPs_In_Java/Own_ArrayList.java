package OOPs_In_Java;

import java.util.ArrayList;

class Arraylist{  // user defined Data structure
    int[] arr;
    int idx = 0;
    int size = 0;

    Arraylist(int capacity){
        arr = new int[capacity];
    }

    int capacity(){
        return arr.length;
    }

    void add(int ele){
        if (idx == arr.length){  // array is full
            int[]arr2 = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx ++] = ele;
        size++;
    }

    void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    int get(int index){
        return arr[index];
    }

    void set(int index, int value){
        arr[index] = value;
    }
    void remove(int index){
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
}

public class Own_ArrayList {
    public static void main(String[] args){
        // ArrayList<Integer>arr = new ArrayList<>();
        // arr.add(10);
//        arr.add(20);
//        arr.add(30);
//        arr.add(40);
//        arr.remove(2);
//        System.out.println(arr.get(2));
        Arraylist arr = new Arraylist(3);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.size);
        arr.display();
        arr.add(40);
        arr.display();
        System.out.println(arr.get(2));
        arr.set(2,10);
        System.out.println(arr.get(2));
    }
}
