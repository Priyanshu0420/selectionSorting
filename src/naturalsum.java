import java.util.*;
public class naturalsum {
    public static void main(String [] args){
        System.out.print("input a value");
        Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
        int sum=0;
        while(value>0){
            sum=sum+value%10;
            value=value/10;
        }
        System.out.println(sum);
    }
}
