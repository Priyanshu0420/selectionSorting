import java.util.*;
public class tryquestion {
    //Enter 3 numbers from the user & make a function to print their average.
    public static int printaverage(int a,int b,int c){
        int d;
        d=(a+b+c)/3;
        System.out.println(d);
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int x = sc.nextInt();
        System.out.println("enter");
        int y = sc.nextInt();
        System.out.println("enter");
        int z=sc.nextInt();
        int p;
        p=printaverage(x,y,z);
        System.out.println("output");
        System.out.println(p);
    }
}
