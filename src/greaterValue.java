import java.util.Scanner;
public class greaterValue {
    public static void greaterValue(int a,int b){
        if(a>b){
                System.out.println("a is greater");
        } else if(b>a){
            System.out.println("b is greater");
        }
        else{
            System.out.println("both are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greaterValue(a,b);
    }
}
