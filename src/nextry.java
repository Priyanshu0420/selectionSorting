import java.util.*;
public class nextry {
    //Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumloop(int num) {
        int sum = 0;
        int val;
        for (int i = 1; i <= 2*num+1; i++) {
            val = i;
            sum = sum + val;
            System.out.println(sum);
        }
        return sum;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int number=sc.nextInt();
            int result=sumloop(number);
            System.out.println(result);
    }
}
