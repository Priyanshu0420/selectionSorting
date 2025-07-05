// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;
public class sumOfOddNoUsingFunction {
    public static void oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum +=i;
            System.out.println(i);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
        oddSum(value);
    }
}
