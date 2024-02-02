// . Given two strings ransomNote and magazine, return true if ransomNote can be constructed 
// by using the letters from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote
import java.util.*;
public class HashMap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the RansomNote String: ");  
        String str1=sc.next();

        System.out.print("Enter the Magazine String: ");  
        String str2=sc.next();


        HashMap<Character, Integer> hm1 = new HashMap<>();

        for(int i=0;i<str1.length(); i++ ){
            if(hm1.containsKey(str1.charAt(i))) {
                hm1.put(str1.charAt(i), hm1.get(str1.charAt(i))+1);
            }
            else
                hm1.put(str1.charAt(i), 1);
        }     

        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i=0;i<str2.length(); i++ ){
            if(hm2.containsKey(str2.charAt(i))) {
                hm2.put(str2.charAt(i), hm2.get(str2.charAt(i))+1);
            }
            else
                hm2.put(str2.charAt(i), 1);
        }     

        

        Integer answer = -1;
        for(Map.Entry<Character, Integer> e: hm1.entrySet()) {

            if(e.getValue() > hm2.get(e.getKey())){

                System.out.println("False");
                answer = 1;
                break;
            }
        }
        if(answer == -1)
            System.out.println("True");
    }
}
