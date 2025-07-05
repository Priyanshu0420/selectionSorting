import java.util.*;
public class printAvgUsingFunction {
    public static int printAvg(int a,int b,int c){
        int value=(a+b+c);
        int average=value/3;
        return average;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input value 1:");
        int a= sc.nextInt();
        System.out.println("input value 2:");
        int b=sc.nextInt();
        System.out.println("input value 3:");
        int c=sc.nextInt();
        System.out.println("final value is :");
        int final_value=printAvg(a,b,c);
        System.out.println(final_value);
    }
}
