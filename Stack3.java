import java.util.*; 
public class Stack3 {
    public static int calculatePoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        for(int i = 0; i < ops.length; i++)
        {
            if(ops[i].equals("+"))
            {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int temp_sum = temp1 + temp2;
                sum += temp_sum;
                stack.push(temp2);
                stack.push(temp1);
                stack.push(temp_sum);
            }
            else if(ops[i].equals("D"))
            {
                int temp = stack.pop();
                int temp_D = 2 * temp;
                sum += temp_D;
                stack.push(temp);
                stack.push(temp_D);
            }
            else if(ops[i].equals("C"))
            {
                int cancel = stack.pop();
                sum -= cancel;
            }
            else
            {
                int temp = Integer.parseInt(ops[i]);
                sum += temp;
                stack.push(temp);   
            }
            }
            return sum;
        }
    public static void main(String[] args) {
        String []str = {"5","-2","4","C","D","9","+","+"};
        System.out.println("The score is: " + calculatePoints(str));
    }
}
