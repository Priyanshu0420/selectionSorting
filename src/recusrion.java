import java.util.Scanner;
public class recusrion {
    public static void recuyrse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        recuyrse(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        recuyrse(n);
    }
}
