// Detect if an Array contains a duplicate element. At Most 1 duplicate would be there
// Input: 
// 1,2,3,4
// Output:
// No
import java.util.HashMap;
import java.util.Scanner;
public class HashMap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of array: ");  
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");  
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        boolean ans = false;
        for (int i = 0; i < n; i++) {
            if(h.containsKey(arr[i])){
                ans = true;
                System.out.println("Yes");
            }
        }
        if(ans == false){
            System.out.println("No");
        }
    }
}
