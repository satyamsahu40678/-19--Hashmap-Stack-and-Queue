/**
 * HashMap4
 */
// 
import java.util.*;
import java.util.Scanner;
public class HashMap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of array: ");  
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");  
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], 1);
        }

        System.out.println("Largest element: " + map.lastEntry().getKey());
    }
    
}