// Implement a Map in java which takes the input and print the list in sorted order based on key.
// Input:
//  5- Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay, 

// Output:
//  {1=Ram, 2=Lakshay, 4=Krrish, 5=Rahul, 7=lakshman}

/**
 * HashMap1
 */
import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");  
        
        int n = sc.nextInt();
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("Enter key and value: ");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String val = sc.next();
            map.put(key, val);
        }
        System.out.println(map);
    }
}