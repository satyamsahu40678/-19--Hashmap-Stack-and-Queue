import java.util.HashMap;
import java.util.Scanner;

public class HashMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");  
        
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Enter key and value: ");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String val = sc.next();
            map.put(val, key);
        }
        System.out.println(map);
    }
}
