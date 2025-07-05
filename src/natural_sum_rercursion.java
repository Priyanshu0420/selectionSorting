import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class natural_sum_rercursion {
    public static void recuyrse(int i,int n, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
      //  System.out.println(n);
        sum=sum+i;
        recuyrse(i+1,n,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //    int n=sc.nextInt();
     //   int i=sc.nextInt();
   //     int sum=sc.nextInt();
        recuyrse(1,9,0);
    }
}
